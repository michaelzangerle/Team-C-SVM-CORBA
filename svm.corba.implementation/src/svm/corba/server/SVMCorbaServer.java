package svm.corba.server;

import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;
import org.omg.PortableServer.Servant;
import svm.corba.abstraction.cfactory.CorbaControllerFactory;
import svm.corba.abstraction.cfactory.CorbaControllerFactoryHelper;
import svm.corba.abstraction.controller.login.CorbaLoginController;
import svm.corba.abstraction.controller.login.CorbaLoginControllerHelper;
import svm.corba.abstraction.controller.member.CorbaMemberController;
import svm.corba.abstraction.controller.member.CorbaMemberControllerHelper;
import svm.corba.abstraction.cto.CTO;
import svm.corba.abstraction.cto.auth.CTOAuth;
import svm.corba.abstraction.cto.auth.CTOAuthHelper;
import svm.corba.abstraction.cto.member.CTOMember;
import svm.corba.abstraction.cto.member.CTOMemberHelper;
import svm.corba.abstraction.exceptions.RegisterException;
import svm.corba.implementation.CorbaControllerFactoryImpl;
import svm.corba.implementation.cto.CTOAuthImpl;
import svm.corba.implementation.cto.CTOMemberImpl;
import svm.corba.implementation.cto.ICTO;

import java.util.*;

/**
 * ProjectTeam: Team C
 * Date: 10.11.12
 */
public class SVMCorbaServer {

    // region Singleton
    private static SVMCorbaServer instance;

    public static SVMCorbaServer init(String[] args) throws InvalidName, AdapterInactive {
        instance = new SVMCorbaServer(args);
        return instance;
    }

    public static SVMCorbaServer getInstance() {
        return instance;
    }
    // endregion

    // region fields
    private HashMap<Integer, ICTO> ctos = new HashMap<Integer, ICTO>();
    private int nextID = 1;

    private POA rootPOA;
    private ORB orb;
    // endregion

    // region CTOR
    private SVMCorbaServer(String[] args) throws InvalidName, AdapterInactive {
        orb = ORB.init(args, null);
        rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
        rootPOA.the_POAManager().activate();
    }
    // endregion

    // region CORBA
    private org.omg.CORBA.Object addObject(Servant s) throws WrongPolicy, ServantNotActive {
        return rootPOA.servant_to_reference(s);
    }

    private void register(String name, org.omg.CORBA.Object obj) throws InvalidName, org.omg.CosNaming.NamingContextPackage.InvalidName, NotFound, CannotProceed {
        org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
        NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

        NameComponent path[] = ncRef.to_name(name);
        ncRef.rebind(path, obj);
    }

    private org.omg.CORBA.Object getObject(Servant servant) throws RegisterException {
        try {
            return addObject(servant);
        } catch (WrongPolicy wrongPolicy) {
            wrongPolicy.printStackTrace();
            throw new RegisterException("WrongPolicy");
        } catch (ServantNotActive servantNotActive) {
            servantNotActive.printStackTrace();
            throw new RegisterException("ServantNotActive");
        }
    }

    public void run() {
        orb.run();
    }
    //endregion

    // region CTO
    private void addCTO(ICTO cto) {
        cto.setCTOid(nextID);
        ctos.put(cto.CTOid(), cto);
        while (ctos.keySet().contains(nextID)) nextID++;
    }

    public ICTO getCTO(CTO cto) {
        return ctos.get(cto.CTOid());
    }

    public void clean() {
        Calendar c = new GregorianCalendar();
        c.setTime(new Date());
        c.add(Calendar.HOUR, -2);
        Date d = c.getTime();
        List<Integer> toRemove = new LinkedList<Integer>();
        for (ICTO cto : ctos.values()) {
            if (cto.getCreation().before(d)) toRemove.add(cto.CTOid());
        }
        for (Integer i : toRemove) {
            ctos.remove(i);
        }
    }
    // endregion

    // region FACTORY
    private CorbaControllerFactory addFactory(Servant o) throws RegisterException {
        org.omg.CORBA.Object obj = getObject(o);
        return CorbaControllerFactoryHelper.narrow(obj);
    }

    public void registerFactory(String name, CorbaControllerFactoryImpl factory) throws RegisterException {
        try {
            register(name, addFactory(factory));
        } catch (InvalidName invalidName) {
            invalidName.printStackTrace();
            throw new RegisterException("InvalidName");
        } catch (org.omg.CosNaming.NamingContextPackage.InvalidName invalidName) {
            invalidName.printStackTrace();
            throw new RegisterException("InvalidName");
        } catch (NotFound notFound) {
            notFound.printStackTrace();
            throw new RegisterException("NotFound");
        } catch (CannotProceed cannotProceed) {
            cannotProceed.printStackTrace();
            throw new RegisterException("CannotProceed");
        }
    }
    // endregion

    // region addCONTROLLER
    public CorbaLoginController addLoginController(Servant o) throws RegisterException {
        org.omg.CORBA.Object obj = getObject(o);
        return CorbaLoginControllerHelper.narrow(obj);
    }

    public CorbaMemberController addMemberController(Servant o) throws RegisterException {
        org.omg.CORBA.Object obj = getObject(o);
        return CorbaMemberControllerHelper.narrow(obj);
    }
    // endregion

    // region addCTO
    public CTOAuth addCTOAuth(CTOAuthImpl o) throws RegisterException {
        addCTO(o);
        org.omg.CORBA.Object obj = getObject(o);
        return CTOAuthHelper.narrow(obj);
    }

    public CTOMember addCTOMember(CTOMemberImpl o) throws RegisterException {
        addCTO(o);
        org.omg.CORBA.Object obj = getObject(o);
        return CTOMemberHelper.narrow(obj);
    }
    // endregion
}

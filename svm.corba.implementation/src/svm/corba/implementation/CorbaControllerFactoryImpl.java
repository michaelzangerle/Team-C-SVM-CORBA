package svm.corba.implementation;

import svm.corba.abstraction.cfactory.CorbaControllerFactoryPOA;
import svm.corba.abstraction.controller.login.CorbaLoginController;
import svm.corba.abstraction.controller.member.CorbaMemberController;
import svm.corba.abstraction.cto.auth.CTOAuth;
import svm.corba.abstraction.exceptions.AuthNotFoundException;
import svm.corba.abstraction.exceptions.RegisterException;
import svm.corba.implementation.controller.CorbaLoginControllerImpl;
import svm.corba.implementation.controller.CorbaMemberControllerImpl;
import svm.corba.server.SVMCorbaServer;
import svm.logic.abstraction.LogicFacade;
import svm.logic.abstraction.transferobjects.ITransferAuth;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;

/**
 * ProjectTeam: Team C
 * Date: 11.11.12
 */
public class CorbaControllerFactoryImpl extends CorbaControllerFactoryPOA {
    private static CorbaControllerFactoryImpl instance;

    public static CorbaControllerFactoryImpl getInstance() {
        if (instance == null) instance = new CorbaControllerFactoryImpl();
        return instance;
    }

    private CorbaControllerFactoryImpl() {
    }

    private ITransferAuth getAuth(CTOAuth auth) throws AuthNotFoundException {
        ITransferAuth a = (ITransferAuth) SVMCorbaServer.getInstance().getCTO(auth).getTransferObject();
        if (a == null) {
            throw new AuthNotFoundException();
        }
        return a;
    }

    @Override
    public CorbaLoginController getCorbaLoginController() throws RegisterException {
        CorbaLoginControllerImpl impl = new CorbaLoginControllerImpl(LogicFacade.getLoginController());
        return SVMCorbaServer.getInstance().addLoginController(impl);
    }

    @Override
    public CorbaMemberController getMemberController(CTOAuth auth) throws RegisterException, AuthNotFoundException {
        ITransferAuth a = getAuth(auth);
        CorbaMemberControllerImpl impl;
        try {
            impl = new CorbaMemberControllerImpl(LogicFacade.getMemberController(a));
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new RegisterException("NoSessionFoundException");
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RegisterException("InstantiationException");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RegisterException("IllegalAccessException");
        } catch (NotSupportedException e) {
            e.printStackTrace();
            throw new RegisterException("NotSupportedException");
        }
        return SVMCorbaServer.getInstance().addMemberController(impl);
    }
}

package svm.corba.client;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import svm.corba.abstraction.cfactory.CorbaControllerFactory;
import svm.corba.abstraction.cfactory.CorbaControllerFactoryHelper;
import svm.corba.abstraction.controller.login.CorbaLoginController;
import svm.corba.abstraction.cto.auth.CTOAuth;

/**
 * ProjectTeam: Team C
 * Date: 11.11.12
 */
public class Main {
    public static void main(String[] args) {
        try {
            // create and initialize the ORB
            ORB orb = ORB.init(args, null);

            // get the root naming context
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            // Use NamingContextExt instead of NamingContext. This is
            // part of the Interoperable naming Service.
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // resolve the Object Reference in Naming
            String name = "SVMFactory";
            CorbaControllerFactory factory = CorbaControllerFactoryHelper.narrow(ncRef.resolve_str(name));

            CorbaLoginController loginController = factory.getCorbaLoginController();
            loginController.start();

            System.out.println("Obtained a handle on server object: " + factory);
            System.out.println("Obtained a handle on server object: " + loginController);
            System.out.println(loginController.loginWithoutLdap("jwa8658", ""));
            CTOAuth auth = loginController.getMember();
            loginController.commit();
            System.out.println(auth.firstName() + " " + auth.lastName());
        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }
}

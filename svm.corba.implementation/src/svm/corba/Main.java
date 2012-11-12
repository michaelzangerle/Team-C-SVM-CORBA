package svm.corba;

import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import svm.corba.abstraction.exceptions.RegisterException;
import svm.corba.implementation.CorbaControllerFactoryImpl;
import svm.corba.server.SVMCorbaServer;

/**
 * ProjectTeam: Team C
 * Date: 11.11.12
 */
public class Main {
    public static void main(String[] args) throws RegisterException, InvalidName, AdapterInactive {
        SVMCorbaServer.init(args);
        SVMCorbaServer.getInstance().registerFactory("SVMFactory", CorbaControllerFactoryImpl.getInstance());
        SVMCorbaServer.getInstance().run();
    }
}

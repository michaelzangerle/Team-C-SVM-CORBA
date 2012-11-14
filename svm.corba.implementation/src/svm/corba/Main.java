package svm.corba;

import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import svm.corba.abstraction.exceptions.RegisterException;
import svm.corba.implementation.ExportImpl;
import svm.corba.server.SVMCorbaServer;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.persistence.abstraction.exceptions.NotSupportedException;

import java.rmi.RemoteException;

/**
 * ProjectTeam: Team C
 * Date: 11.11.12
 */
public class Main {
    public static void main(String[] args) throws RegisterException, InvalidName, AdapterInactive, NotSupportedException, ExistingTransactionException, IllegalGetInstanceException, NoSessionFoundException, NoTransactionException, RemoteException, IllegalAccessException, InstantiationException {
        SVMCorbaServer.init(args);
        SVMCorbaServer.getInstance().registerExport("SVMExport", ExportImpl.getInstance());
        SVMCorbaServer.getInstance().run();
    }
}

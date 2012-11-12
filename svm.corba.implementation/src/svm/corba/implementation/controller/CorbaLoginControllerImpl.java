package svm.corba.implementation.controller;

import svm.corba.abstraction.controller.login.CorbaLoginControllerPOA;
import svm.corba.abstraction.cto.auth.CTOAuth;
import svm.corba.abstraction.exceptions.ControllerNotStartedException;
import svm.corba.abstraction.exceptions.RegisterException;
import svm.corba.abstraction.exceptions.UnknownException;
import svm.corba.implementation.cto.CTOAuthImpl;
import svm.corba.server.SVMCorbaServer;
import svm.logic.abstraction.controller.ILoginController;
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
public class CorbaLoginControllerImpl extends CorbaLoginControllerPOA {

    private ILoginController controller;

    public CorbaLoginControllerImpl(ILoginController controller) {
        this.controller = controller;
    }

    @Override
    public boolean login(String userName, String password) throws UnknownException, ControllerNotStartedException {
        try {
            return controller.login(userName, password);
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
            return false;
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
            throw new UnknownException("IllegalGetInstanceException");
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new ControllerNotStartedException("NoSessionFoundException");
        }
    }

    @Override
    public boolean loginWithoutLdap(String userName, String password) throws UnknownException, ControllerNotStartedException {
        try {
            return controller.loginWithoutLdap(userName, password);
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
            return false;
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
            throw new UnknownException("IllegalGetInstanceException");
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new ControllerNotStartedException("NoSessionFoundException");
        }
    }

    @Override
    public CTOAuth getMember() throws RegisterException {
        try {
            return SVMCorbaServer.getInstance().addCTOAuth(new CTOAuthImpl(this.controller.getMember()));
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void start() throws UnknownException, ControllerNotStartedException {
        try {
            this.controller.start();
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
            throw new UnknownException("IllegalGetInstanceException");
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new ControllerNotStartedException("NoSessionFoundException");
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
            throw new RuntimeException();
        } catch (NotSupportedException e) {
            e.printStackTrace();
            throw new UnknownException("NotSupportedException");
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new UnknownException("InstantiationException");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new UnknownException("IllegalAccessException");
        }
    }

    @Override
    public void commit() throws ControllerNotStartedException {
        try {
            this.controller.commit();
        } catch (ExistingTransactionException e) {
            e.printStackTrace();
            throw new ControllerNotStartedException("ExistingTransactionException");
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new ControllerNotStartedException("NoSessionFoundException");
        } catch (NoTransactionException e) {
            e.printStackTrace();
            throw new ControllerNotStartedException("NoTransactionException");
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @Override
    public void abort() throws ControllerNotStartedException {
        try {
            this.controller.abort();
        } catch (ExistingTransactionException e) {
            e.printStackTrace();
            throw new ControllerNotStartedException("ExistingTransactionException");
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
            throw new ControllerNotStartedException("NoSessionFoundException");
        } catch (NoTransactionException e) {
            e.printStackTrace();
            throw new ControllerNotStartedException("NoTransactionException");
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}

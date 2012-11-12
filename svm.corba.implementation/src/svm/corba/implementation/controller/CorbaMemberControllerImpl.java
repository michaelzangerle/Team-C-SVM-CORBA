package svm.corba.implementation.controller;

import svm.corba.abstraction.controller.member.CorbaMemberControllerPOA;
import svm.corba.abstraction.cto.location.CTOLocation;
import svm.corba.abstraction.cto.member.CTOMember;
import svm.corba.abstraction.exceptions.*;
import svm.corba.implementation.cto.CTOMemberImpl;
import svm.corba.server.SVMCorbaServer;
import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.logic.abstraction.controller.IMemberController;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;

import java.rmi.RemoteException;
import java.util.Date;

/**
 * ProjectTeam: Team C
 * Date: 11.11.12
 */
public class CorbaMemberControllerImpl extends CorbaMemberControllerPOA {
    private IMemberController controller;

    public CorbaMemberControllerImpl(IMemberController memberController) {
        this.controller = memberController;
    }

    @Override
    public CTOMember getMember() throws RegisterException {
        return SVMCorbaServer.getInstance().addCTOMember(new CTOMemberImpl(this.controller.getMember()));
    }

    @Override
    public void setTitle(String title) throws NotAllowException, AttributeException {
        try {
            controller.setTitle(title);
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        }
    }

    @Override
    public void setFirstName(String firstName) throws NotAllowException, AttributeException {
        try {
            controller.setFirstName(firstName);
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        }
    }

    @Override
    public void setLastName(String lastName) throws NotAllowException, AttributeException {
        try {
            controller.setLastName(lastName);
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        }
    }

    @Override
    public void setSocialNumber(String socialNumber) throws NotAllowException, AttributeException {
        try {
            controller.setSocialNumber(socialNumber);
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        }
    }

    @Override
    public void setBirthDate(long birthDate) throws NotAllowException, AttributeException {
        try {
            controller.setBirthDate(new Date(birthDate));
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        } catch (DomainParameterCheckException e) {
            e.printStackTrace();
            throw new AttributeException("DomainParameterCheckException");
        }
    }

    @Override
    public void setGender(String gender) throws NotAllowException, AttributeException {
        try {
            controller.setGender(gender);
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        } catch (DomainParameterCheckException e) {
            e.printStackTrace();
            throw new NotAllowException("DomainParameterCheckException");
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        }
    }

    @Override
    public void setEntryDate(long entryDate) throws NotAllowException, AttributeException {
        try {
            controller.setEntryDate(new Date(entryDate));
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        } catch (DomainParameterCheckException e) {
            e.printStackTrace();
            throw new AttributeException("DomainParameterCheckException");
        }
    }

    @Override
    public void setPhone1(String phone1) throws NotAllowException, AttributeException {
        try {
            controller.setPhone1(phone1);
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        }
    }

    @Override
    public void setPhone2(String phone2) throws NotAllowException, AttributeException {
        try {
            controller.setPhone2(phone2);
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        }
    }

    @Override
    public void setEmail1(String email1) throws NotAllowException, AttributeException {
        try {
            controller.setEmail1(email1);
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        }
    }

    @Override
    public void setEmail2(String email2) throws NotAllowException, AttributeException {
        try {
            controller.setEmail2(email2);
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        }
    }

    @Override
    public void setFax(String fax) throws NotAllowException, AttributeException {
        try {
            controller.setFax(fax);
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        }
    }

    @Override
    public void setStreet(String street) throws NotAllowException, AttributeException {
        try {
            controller.setStreet(street);
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        }
    }

    @Override
    public void setStreetNumber(String streetNumber) throws NotAllowException, AttributeException {
        try {
            controller.setStreetNumber(streetNumber);
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        }
    }

    @Override
    public void setCoordLat(String coordLat) throws NotAllowException, AttributeException {
        try {
            controller.setLat(coordLat);
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        }
    }

    @Override
    public void setCoordLong(String coordLong) throws NotAllowException, AttributeException {
        try {
            controller.setLong(coordLong);
        } catch (RemoteException e) {
            // TODO RemoteException raus
            e.printStackTrace();
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();
            throw new NotAllowException("NotAllowException");
        } catch (DomainAttributeException e) {
            e.printStackTrace();
            throw new AttributeException("DomainAttributeException");
        }
    }

    @Override
    public void setLocation(CTOLocation location) throws NotAllowException, AttributeException {
        // TODO setLocation
    }

    @Override
    public void setPaidCurrentYear() throws NotAllowException, AttributeException {
        try {
            controller.setPaidCurrentYear();
        } catch (NoSessionFoundException e) {
            e.printStackTrace();

        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (svm.logic.abstraction.exception.NotAllowException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NotSupportedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @Override
    public void setUsername(String userName) throws NotAllowException, AttributeException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void start() throws ControllerNotStartedException, UnknownException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void commit() throws ControllerNotStartedException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void abort() throws ControllerNotStartedException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

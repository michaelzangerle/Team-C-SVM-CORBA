package svm.corba.implementation.cto;

import svm.corba.abstraction.cto.contactDetails.CTOContactDetailsPOA;
import svm.corba.abstraction.cto.location.CTOLocation;
import svm.corba.abstraction.exceptions.LogicException;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferContactDetails;

import java.util.Date;

/**
 * Projectteam: Team C
 * Date: 13.11.12
 */
public class CTOContactDetailsImpl extends CTOContactDetailsPOA implements ICTO<ITransferContactDetails> {

    private ITransferContactDetails contactDetails;
    private Date creation;
    private int id;

    public CTOContactDetailsImpl(ITransferContactDetails contactDetails) {
        this.contactDetails = contactDetails;
        this.creation = new Date();
    }

    @Override
    public String phone1() {
        return contactDetails.getPhone1();
    }

    @Override
    public String phone2() {
        return contactDetails.getPhone2();
    }

    @Override
    public String email1() {
        return contactDetails.getEmail1();
    }

    @Override
    public String email2() {
        return contactDetails.getEmail2();
    }

    @Override
    public String fax() {
        return contactDetails.getFax();
    }

    @Override
    public String street() {
        return contactDetails.getStreet();
    }

    @Override
    public String streetNumber() {
        return contactDetails.getStreetNumber();
    }

    @Override
    public String coordLat() {
        return contactDetails.getLat();
    }

    @Override
    public String coordLong() {
        return contactDetails.getLong();
    }

    @Override
    public CTOLocation location() throws LogicException {

        CTOLocationImpl location = null;
        try {
            location = new CTOLocationImpl(this.contactDetails.getLocation());
            return location;
        } catch (IllegalGetInstanceException e) {
            throw new LogicException(e.getMessage());
        }
    }

    @Override
    public void setCTOid(int id) {
        this.id = id;
    }

    @Override
    public int CTOid() {
        return this.id;
    }

    @Override
    public ITransferContactDetails getTransferObject() {
        return this.contactDetails;
    }

    @Override
    public Date getCreation() {
        return creation;
    }
}

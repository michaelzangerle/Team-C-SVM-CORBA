package svm.corba.implementation.cto;

import svm.corba.abstraction.cto.location.CTOLocation;
import svm.corba.abstraction.cto.member.CTOMemberPOA;
import svm.corba.abstraction.exceptions.AttributeException;
import svm.corba.abstraction.exceptions.LogicException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferMember;

import java.util.Date;

/**
 * ProjectTeam: Team C
 * Date: 11.11.12
 */
public class CTOMemberImpl extends CTOMemberPOA implements ICTO<ITransferMember> {
    private ITransferMember member;
    private Date creation;
    private int id;

    public CTOMemberImpl(ITransferMember member) {
        this.member = member;
        this.creation = new Date();
    }

    @Override
    public String userName() {
        return member.getUsername();
    }

    @Override
    public String firstName() {
        return member.getFirstName();
    }

    @Override
    public String lastName() {
        return member.getLastName();
    }

    @Override
    public String title() {
        return member.getTitle();
    }

    @Override
    public String socialNumber() {
        return member.getSocialNumber();
    }

    @Override
    public long birthDate() {
        return member.getBirthDate().getTime();
    }

    @Override
    public String gender() {
        return member.getGender();
    }

    @Override
    public long entryDate() {
        return member.getEntryDate().getTime();
    }

    @Override
    public String phone1() {
        return member.getPhone1();
    }

    @Override
    public String phone2() {
        return member.getPhone2();
    }

    @Override
    public String email1() {
        return member.getEmail1();
    }

    @Override
    public String email2() {
        return member.getEmail2();
    }

    @Override
    public String fax() {
        return member.getFax();
    }

    @Override
    public String street() {
        return member.getStreet();
    }

    @Override
    public String streetNumber() {
        return member.getStreetNumber();
    }

    @Override
    public String coordLat() {
        return member.getLat();
    }

    @Override
    public String coordLong() {
        return member.getLong();
    }

    @Override
    public CTOLocation getLocation() throws LogicException {
        try {
            return new CTOLocationImpl(member.getLocation())._this();
        } catch (IllegalGetInstanceException e) {
            throw new LogicException(e.getMessage());
        }
    }


    @Override
    public boolean getPaid() throws AttributeException {
        try {
            return member.getPaid();
        } catch (DomainParameterCheckException e) {
           throw new AttributeException(e.getMessage());
        }
    }


    @Override
    public void setCTOid(int id) {
        this.id = id;
    }

    @Override
    public int CTOid() {
        return id;
    }

    @Override
    public ITransferMember getTransferObject() {
        return member;
    }

    @Override
    public Date getCreation() {
        return creation;
    }
}

package svm.corba.implementation.cto;

import svm.corba.abstraction.cto.contest.CTOContestPOA;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferContactDetails;
import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferLocation;

import java.util.Date;

/**
 * Projectteam : Team C
 * Date: 13.11.12
 */
public class CTOContestImpl extends CTOContestPOA implements ICTO<ITransferContest> {

    private ITransferContest contest;
    private Date creation;
    private int id;

    public CTOContestImpl(ITransferContest contest) {
        this.contest = contest;
        this.creation = new Date();
    }


    @Override
    public String name() {
        return contest.getName();
    }

    @Override
    public long startDate() {
        return contest.getStart().getTime();
    }

    @Override
    public long endDate() {
        return contest.getEnd().getTime();
    }

    @Override
    public float fee() {
        return contest.getFee();
    }

    @Override
    public String phone1() {
        if(getContactDetails().getPhone1() == null) return "";
        return getContactDetails().getPhone1();
    }

    @Override
    public String phone2() {
        if(getContactDetails().getPhone2() == null) return "";
        return getContactDetails().getPhone2();
    }

    @Override
    public String email1() {
        if(getContactDetails().getEmail1() == null) return "";
        return getContactDetails().getEmail2();
    }

    @Override
    public String email2() {
        if(getContactDetails().getEmail2() == null) return "";
        return getContactDetails().getEmail1();
    }

    @Override
    public String fax() {
        if(getContactDetails().getFax() == null) return "";
        return getContactDetails().getFax();
    }

    @Override
    public String street() {
        if(getContactDetails().getStreet() == null) return "";
        return getContactDetails().getStreet();
    }

    @Override
    public String streetNumber() {
        if(getContactDetails().getStreetNumber() == null) return "";
        return getContactDetails().getStreetNumber();
    }

    @Override
    public String coordLat() {
        return getContactDetails().getLat();
    }

    @Override
    public String coordLong() {
        return getContactDetails().getLong();
    }

    @Override
    public String countryCode() {
        return getLocation().getCountryCode();
    }

    @Override
    public String postalCode() {
        return getLocation().getPostalCode();
    }

    @Override
    public String placeName() {
        return getLocation().getPlaceName();
    }

    @Override
    public String district() {
        return getLocation().getDistrict();
    }

    @Override
    public String sport() {
        try {
            if(contest.getSport() == null) return "";
            return contest.getSport().getName();
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
            return "";
        }

    }

    @Override
    public boolean finished() {
        return contest.isFinished();
    }

    private ITransferLocation getLocation() {
        try {
            return getContactDetails().getLocation();
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private ITransferContactDetails getContactDetails() {
        try {
            return contest.getContactDetails();
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage(), e);
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
    public ITransferContest getTransferObject() {
        return contest;
    }

    @Override
    public Date getCreation() {
        return creation;
    }
}

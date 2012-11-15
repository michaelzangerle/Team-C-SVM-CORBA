package svm.corba.implementation.cto;

import svm.corba.abstraction.cto.match.CTOMatchPOA;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferContactDetails;
import svm.logic.abstraction.transferobjects.ITransferLocation;
import svm.logic.abstraction.transferobjects.ITransferMatch;

import java.util.Date;

/**
 * Projectteam: Team C
 * Date: 13.11.12
 */
public class CTOMatchImpl extends CTOMatchPOA implements ICTO<ITransferMatch> {
    private ITransferMatch match;
    private Date creation;
    private int id;

    public CTOMatchImpl(ITransferMatch match) {
        this.match = match;
        this.creation = new Date();
    }

    @Override
    public String name() {
        return match.getName();
    }

    @Override
    public long startDate() {
        return match.getStart().getTime();
    }

    @Override
    public long endDate() {
        return match.getEnd().getTime();
    }

    @Override
    public boolean canceled() {
        return match.isCanceled();
    }

    @Override
    public String description() {
        if(match.getDescription() == null) return "";
        return match.getDescription();
    }

    @Override
    public String remarks() {
        if(match.getRemarks() == null) return "";
        return match.getRemarks();
    }

    @Override
    public int resultAway() {
        return match.getResultAway();
    }

    @Override
    public int resultHome() {
        return match.getResultHome();
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
    public String homeTeam() {
        try {
            return match.getHomeTeam().getName();
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override
    public String awayTeam() {
        try {
            return match.getAwayTeam().getName();
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage(), e);
        }
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
            return match.getContactDetails();
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
        return this.id;
    }

    @Override
    public ITransferMatch getTransferObject() {
        return this.match;
    }

    @Override
    public Date getCreation() {
        return this.creation;
    }
}

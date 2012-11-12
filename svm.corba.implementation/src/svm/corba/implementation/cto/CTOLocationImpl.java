package svm.corba.implementation.cto;

import svm.corba.abstraction.cto.location.CTOLocationPOA;
import svm.logic.abstraction.transferobjects.ITransferLocation;

import java.util.Date;

/**
 * ProjectTeam: Team C
 * Date: 11.11.12
 */
public class CTOLocationImpl extends CTOLocationPOA implements ICTO<ITransferLocation> {
    private ITransferLocation location;
    private Date creation;
    private int id;

    public CTOLocationImpl(ITransferLocation location) {
        this.location = location;
        this.creation = new Date();
    }

    @Override
    public String countryCode() {
        return location.getCountryCode();
    }

    @Override
    public String postalCode() {
        return location.getPostalCode();
    }

    @Override
    public String placeName() {
        return location.getPlaceName();
    }

    @Override
    public String district() {
        return location.getDistrict();
    }

    @Override
    public String province() {
        return location.getProvince();
    }

    @Override
    public String community() {
        return location.getCommunity();
    }

    @Override
    public String coordLat() {
        return location.getLatitude();
    }

    @Override
    public String coordLong() {
        return location.getLongitude();
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
    public ITransferLocation getTransferObject() {
        return location;
    }

    @Override
    public Date getCreation() {
        return creation;
    }
}

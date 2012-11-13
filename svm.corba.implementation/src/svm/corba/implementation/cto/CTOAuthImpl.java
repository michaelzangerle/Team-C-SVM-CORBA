package svm.corba.implementation.cto;

import svm.corba.abstraction.cto.auth.CTOAuthPOA;
import svm.logic.abstraction.transferobjects.ITransferAuth;

import java.util.Date;

/**
 * ProjectTeam: Team C
 * Date: 11.11.12
 */
public class CTOAuthImpl extends CTOAuthPOA implements ICTO<ITransferAuth> {
    private ITransferAuth auth;
    private Date creation;
    private int id;

    public CTOAuthImpl(ITransferAuth auth) {
        this.auth = auth;
        this.creation = new Date();
    }

    @Override
    public String firstName() {
        return auth.getFirstName();
    }

    @Override
    public String lastName() {
        return auth.getLastName();
    }

    @Override
    public String username() {
        return auth.getUsername();
    }

    @Override
    public String title() {
       return auth.getTitle();
    }

    @Override
    public int CTOid() {
        return id;
    }

    @Override
    public void setCTOid(int id) {
        this.id = id;
    }

    @Override
    public ITransferAuth getTransferObject() {
        return auth;
    }

    @Override
    public Date getCreation() {
        return creation;
    }
}

package svm.corba.implementation.cto;

import svm.corba.abstraction.cto.team.CTOTeamPOA;
import svm.logic.abstraction.transferobjects.ITransferTeam;

import java.util.Date;

/**
 * Projectteam : Team C
 * Date: 13.11.12
 */
public class CTOTeamImpl extends CTOTeamPOA implements ICTO<ITransferTeam>
{
    private ITransferTeam team;
    private Date creation;
    private int id;

    public CTOTeamImpl(ITransferTeam team) {
        this.team = team;
        this.creation = new Date();
    }

    @Override
    public String name() {
        return team.getName();
    }

    @Override
    public void setCTOid(int id) {
        this.id=id;
    }

    @Override
    public int CTOid() {
        return id;
    }

    @Override
    public ITransferTeam getTransferObject() {
        return team;
    }

    @Override
    public Date getCreation() {
        return creation;
    }
}

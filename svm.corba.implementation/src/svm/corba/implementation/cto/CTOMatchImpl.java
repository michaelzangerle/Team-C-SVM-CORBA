package svm.corba.implementation.cto;

import svm.corba.abstraction.cto.contactDetails.CTOContactDetails;
import svm.corba.abstraction.cto.match.CTOMatchPOA;
import svm.corba.abstraction.cto.matchType.CTOMatchType;
import svm.corba.abstraction.cto.team.CTOTeam;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
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

    public CTOMatchImpl(ITransferMatch location) {
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
        return match.getDescription();
    }

    @Override
    public String remarks() {
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
    public CTOTeam homeTeam() {
        try {
            CTOTeamImpl team = new CTOTeamImpl(match.getHomeTeam());
            return team._this();
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
        }
    }

    @Override
    public CTOTeam awayTeam() {
        try {
            CTOTeamImpl team = new CTOTeamImpl(match.getAwayTeam());
            return team._this();
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
        }
    }

    @Override
    public CTOMatchType matchType() {
        try {
            CTOMatchTypeImpl type = new CTOMatchTypeImpl(match.getMatchType());
            return type._this();
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
        }
    }

    @Override
    public CTOContactDetails contactDetails() {
        try {
            CTOContactDetailsImpl c = new CTOContactDetailsImpl(match.getContactDetails());
            return c._this();
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();
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

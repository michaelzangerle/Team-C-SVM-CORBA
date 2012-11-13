package svm.corba.implementation.cto;

import svm.corba.abstraction.cto.contactDetails.CTOContactDetails;
import svm.corba.abstraction.cto.contest.CTOContestPOA;
import svm.corba.abstraction.exceptions.LogicException;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferContest;

import java.util.Date;

/**
 * Projectteam : Team C
 * Date: 13.11.12
 */
public class CTOContestImp extends CTOContestPOA implements ICTO<ITransferContest> {

    private ITransferContest contest;
    private Date creation;
    private int id;

    public CTOContestImp(ITransferContest contest) {
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
    public CTOContactDetails getContactDetails() throws LogicException {
        try {
            return new CTOContactDetailsImpl(contest.getContactDetails())._this();
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

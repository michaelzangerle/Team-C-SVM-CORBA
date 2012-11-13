package svm.corba.implementation.cto;

import svm.corba.Main;
import svm.corba.abstraction.cto.auth.CTOAuthPOA;
import svm.corba.abstraction.cto.contest.CTOContestPOA;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.transferobjects.ITransferContest;

import java.util.Date;

/**
 * Projectteam : Team C
 * Date: 13.11.12
 */
public class CTOContestImp extends CTOContestPOA implements ICTO<ITransferContest> {

    private ITransferContest location;
    private Date creation;
    private int id;

    public CTOContestImp(ITransferContest contest) {
        this.location = contest;
        this.creation = new Date();
    }


    @Override
    public String name() {
        location.getName();
    }

    @Override
    public long startDate() {
        return location.getStart().getTime();
    }

    @Override
    public long endDate() {
        return location.getEnd().getTime();
    }

    @Override
    public float fee() {
        return  location.getFee();
    }

    @Override
    public svm.corba.abstraction.cto.contactDetails.CTOContactDetails contactDetails() {
        try {
            return new CTOContactDetailsImpl(location.getContactDetails());
        } catch (IllegalGetInstanceException e) {
        }
    }

    @Override
    public void setCTOid(int id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int CTOid() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ITransferContest getTransferObject() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Date getCreation() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

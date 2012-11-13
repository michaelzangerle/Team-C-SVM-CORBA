package svm.corba.implementation.cto;

import svm.corba.abstraction.cto.matchType.CTOMatchTypePOA;
import svm.logic.abstraction.transferobjects.ITransferMatchType;

import java.util.Date;

/**
 * Projectteam : Team C
 * Date: 13.11.12
 */
public class CTOMatchTypeImpl extends CTOMatchTypePOA implements ICTO<ITransferMatchType> {

    private ITransferMatchType matchTyp;
    private Date creation;
    private int id;

    public CTOMatchTypeImpl(ITransferMatchType matchTyp) {
        this.matchTyp = matchTyp;
        this.creation = new Date();
    }

    @Override
    public String name() {
      return matchTyp.getName();
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
    public ITransferMatchType getTransferObject() {
        return matchTyp;
    }

    @Override
    public Date getCreation() {
        return creation;
    }
}

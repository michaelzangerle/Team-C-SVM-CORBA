package svm.corba.implementation.cto;

import svm.logic.abstraction.transferobjects.ITransfer;

import java.util.Date;

/**
 * ProjectTeam: Team C
 * Date: 11.11.12
 */
public interface ICTO<T extends ITransfer> {
    void setCTOid(int id);

    int CTOid();

    T getTransferObject();

    Date getCreation();
}

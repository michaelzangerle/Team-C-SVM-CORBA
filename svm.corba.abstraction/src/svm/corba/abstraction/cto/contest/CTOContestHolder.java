package svm.corba.abstraction.cto.contest;

/**
* svm/corba/abstraction/cto/contest/CTOContestHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOContest.idl
* Mittwoch, 14. November 2012 08:42 Uhr MEZ
*/

public final class CTOContestHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.cto.contest.CTOContest value = null;

  public CTOContestHolder ()
  {
  }

  public CTOContestHolder (svm.corba.abstraction.cto.contest.CTOContest initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.cto.contest.CTOContestHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.cto.contest.CTOContestHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.cto.contest.CTOContestHelper.type ();
  }

}

package svm.corba.abstraction.cto.team;

/**
* svm/corba/abstraction/cto/team/CTOTeamHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOTeam.idl
* Dienstag, 13. November 2012 16:05 Uhr MEZ
*/

public final class CTOTeamHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.cto.team.CTOTeam value = null;

  public CTOTeamHolder ()
  {
  }

  public CTOTeamHolder (svm.corba.abstraction.cto.team.CTOTeam initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.cto.team.CTOTeamHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.cto.team.CTOTeamHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.cto.team.CTOTeamHelper.type ();
  }

}

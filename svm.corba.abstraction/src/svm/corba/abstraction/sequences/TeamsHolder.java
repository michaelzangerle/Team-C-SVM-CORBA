package svm.corba.abstraction.sequences;

/**
* svm/corba/abstraction/sequences/TeamsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Export.idl
* Dienstag, 13. November 2012 15:48 Uhr MEZ
*/

public final class TeamsHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.sequences.Teams value = null;

  public TeamsHolder ()
  {
  }

  public TeamsHolder (svm.corba.abstraction.sequences.Teams initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.sequences.TeamsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.sequences.TeamsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.sequences.TeamsHelper.type ();
  }

}

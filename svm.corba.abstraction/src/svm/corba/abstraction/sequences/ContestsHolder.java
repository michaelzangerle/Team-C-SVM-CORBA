package svm.corba.abstraction.sequences;

/**
* svm/corba/abstraction/sequences/ContestsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Export.idl
* Dienstag, 13. November 2012 15:25 Uhr MEZ
*/

public final class ContestsHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.sequences.Contests value = null;

  public ContestsHolder ()
  {
  }

  public ContestsHolder (svm.corba.abstraction.sequences.Contests initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.sequences.ContestsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.sequences.ContestsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.sequences.ContestsHelper.type ();
  }

}

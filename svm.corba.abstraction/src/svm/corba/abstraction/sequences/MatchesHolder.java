package svm.corba.abstraction.sequences;

/**
* svm/corba/abstraction/sequences/MatchesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Export.idl
* Mittwoch, 14. November 2012 14:43 Uhr MEZ
*/

public final class MatchesHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.sequences.Matches value = null;

  public MatchesHolder ()
  {
  }

  public MatchesHolder (svm.corba.abstraction.sequences.Matches initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.sequences.MatchesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.sequences.MatchesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.sequences.MatchesHelper.type ();
  }

}

package svm.corba.abstraction.cto.matchType;

/**
* svm/corba/abstraction/cto/matchType/CTOMatchTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOMatchType.idl
* Mittwoch, 14. November 2012 14:43 Uhr MEZ
*/

public final class CTOMatchTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.cto.matchType.CTOMatchType value = null;

  public CTOMatchTypeHolder ()
  {
  }

  public CTOMatchTypeHolder (svm.corba.abstraction.cto.matchType.CTOMatchType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.cto.matchType.CTOMatchTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.cto.matchType.CTOMatchTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.cto.matchType.CTOMatchTypeHelper.type ();
  }

}

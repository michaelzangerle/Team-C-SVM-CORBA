package svm.corba.abstraction.cto;

/**
* svm/corba/abstraction/cto/CTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTO.idl
* Dienstag, 13. November 2012 16:05 Uhr MEZ
*/

public final class CTOHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.cto.CTO value = null;

  public CTOHolder ()
  {
  }

  public CTOHolder (svm.corba.abstraction.cto.CTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.cto.CTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.cto.CTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.cto.CTOHelper.type ();
  }

}

package svm.corba.abstraction.cto.location;

/**
* svm/corba/abstraction/cto/location/CTOLocationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOLocation.idl
* Sonntag, 11. November 2012 18:20 Uhr MEZ
*/

public final class CTOLocationHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.cto.location.CTOLocation value = null;

  public CTOLocationHolder ()
  {
  }

  public CTOLocationHolder (svm.corba.abstraction.cto.location.CTOLocation initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.cto.location.CTOLocationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.cto.location.CTOLocationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.cto.location.CTOLocationHelper.type ();
  }

}

package svm.corba.abstraction.cto.contactDetails;

/**
* svm/corba/abstraction/cto/contactDetails/CTOContactDetailsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOContactDetails.idl
* Freitag, 16. November 2012 08:43 Uhr MEZ
*/

public final class CTOContactDetailsHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.cto.contactDetails.CTOContactDetails value = null;

  public CTOContactDetailsHolder ()
  {
  }

  public CTOContactDetailsHolder (svm.corba.abstraction.cto.contactDetails.CTOContactDetails initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.cto.contactDetails.CTOContactDetailsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.cto.contactDetails.CTOContactDetailsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.cto.contactDetails.CTOContactDetailsHelper.type ();
  }

}

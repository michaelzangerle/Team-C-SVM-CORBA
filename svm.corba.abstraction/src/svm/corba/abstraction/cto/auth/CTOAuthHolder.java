package svm.corba.abstraction.cto.auth;

/**
* svm/corba/abstraction/cto/auth/CTOAuthHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOAuth.idl
* Dienstag, 13. November 2012 15:48 Uhr MEZ
*/

public final class CTOAuthHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.cto.auth.CTOAuth value = null;

  public CTOAuthHolder ()
  {
  }

  public CTOAuthHolder (svm.corba.abstraction.cto.auth.CTOAuth initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.cto.auth.CTOAuthHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.cto.auth.CTOAuthHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.cto.auth.CTOAuthHelper.type ();
  }

}

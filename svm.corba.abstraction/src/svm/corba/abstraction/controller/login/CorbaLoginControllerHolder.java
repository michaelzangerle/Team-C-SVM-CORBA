package svm.corba.abstraction.controller.login;

/**
* svm/corba/abstraction/controller/login/CorbaLoginControllerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from controller/CorbaLoginController.idl
* Freitag, 16. November 2012 08:43 Uhr MEZ
*/

public final class CorbaLoginControllerHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.controller.login.CorbaLoginController value = null;

  public CorbaLoginControllerHolder ()
  {
  }

  public CorbaLoginControllerHolder (svm.corba.abstraction.controller.login.CorbaLoginController initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.controller.login.CorbaLoginControllerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.controller.login.CorbaLoginControllerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.controller.login.CorbaLoginControllerHelper.type ();
  }

}

package svm.corba.abstraction.exceptions;

/**
* svm/corba/abstraction/exceptions/RegisterExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from exceptions/RegisterException.idl
* Sonntag, 11. November 2012 18:20 Uhr MEZ
*/

public final class RegisterExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.exceptions.RegisterException value = null;

  public RegisterExceptionHolder ()
  {
  }

  public RegisterExceptionHolder (svm.corba.abstraction.exceptions.RegisterException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.exceptions.RegisterExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.exceptions.RegisterExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.exceptions.RegisterExceptionHelper.type ();
  }

}
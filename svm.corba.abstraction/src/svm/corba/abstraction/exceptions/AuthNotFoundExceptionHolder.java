package svm.corba.abstraction.exceptions;

/**
* svm/corba/abstraction/exceptions/AuthNotFoundExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from exceptions/AuthNotFoundException.idl
* Dienstag, 13. November 2012 14:54 Uhr MEZ
*/

public final class AuthNotFoundExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.exceptions.AuthNotFoundException value = null;

  public AuthNotFoundExceptionHolder ()
  {
  }

  public AuthNotFoundExceptionHolder (svm.corba.abstraction.exceptions.AuthNotFoundException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.exceptions.AuthNotFoundExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.exceptions.AuthNotFoundExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.exceptions.AuthNotFoundExceptionHelper.type ();
  }

}

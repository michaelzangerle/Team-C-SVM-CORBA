package svm.corba.abstraction.exceptions;

/**
* svm/corba/abstraction/exceptions/NotAllowExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from exceptions/NotAllowException.idl
* Freitag, 16. November 2012 08:43 Uhr MEZ
*/

public final class NotAllowExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.exceptions.NotAllowException value = null;

  public NotAllowExceptionHolder ()
  {
  }

  public NotAllowExceptionHolder (svm.corba.abstraction.exceptions.NotAllowException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.exceptions.NotAllowExceptionHelper.type ();
  }

}

package svm.corba.abstraction.exceptions;

/**
* svm/corba/abstraction/exceptions/ControllerNotStartedExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from exceptions/ControllerNotStartedException.idl
* Dienstag, 13. November 2012 15:25 Uhr MEZ
*/

public final class ControllerNotStartedExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.exceptions.ControllerNotStartedException value = null;

  public ControllerNotStartedExceptionHolder ()
  {
  }

  public ControllerNotStartedExceptionHolder (svm.corba.abstraction.exceptions.ControllerNotStartedException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.exceptions.ControllerNotStartedExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.exceptions.ControllerNotStartedExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.exceptions.ControllerNotStartedExceptionHelper.type ();
  }

}

package svm.corba.abstraction.exceptions;

/**
* svm/corba/abstraction/exceptions/LogicExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from exceptions/LogicException.idl
* Mittwoch, 14. November 2012 14:43 Uhr MEZ
*/

public final class LogicExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.exceptions.LogicException value = null;

  public LogicExceptionHolder ()
  {
  }

  public LogicExceptionHolder (svm.corba.abstraction.exceptions.LogicException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.exceptions.LogicExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.exceptions.LogicExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.exceptions.LogicExceptionHelper.type ();
  }

}

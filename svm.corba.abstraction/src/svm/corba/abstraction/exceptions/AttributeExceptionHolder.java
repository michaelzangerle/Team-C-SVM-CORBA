package svm.corba.abstraction.exceptions;

/**
* svm/corba/abstraction/exceptions/AttributeExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from exceptions/AttributeException.idl
* Freitag, 16. November 2012 08:43 Uhr MEZ
*/

public final class AttributeExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.exceptions.AttributeException value = null;

  public AttributeExceptionHolder ()
  {
  }

  public AttributeExceptionHolder (svm.corba.abstraction.exceptions.AttributeException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.exceptions.AttributeExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.exceptions.AttributeExceptionHelper.type ();
  }

}

package svm.corba.abstraction.exceptions;


/**
* svm/corba/abstraction/exceptions/AttributeException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from exceptions/AttributeException.idl
* Sonntag, 11. November 2012 18:20 Uhr MEZ
*/

public final class AttributeException extends org.omg.CORBA.UserException
{

  public AttributeException ()
  {
    super(AttributeExceptionHelper.id());
  } // ctor


  public AttributeException (String $reason)
  {
    super(AttributeExceptionHelper.id() + "  " + $reason);
  } // ctor

} // class AttributeException
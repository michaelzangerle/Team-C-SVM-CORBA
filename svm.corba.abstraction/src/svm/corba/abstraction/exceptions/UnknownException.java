package svm.corba.abstraction.exceptions;


/**
* svm/corba/abstraction/exceptions/UnknownException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from exceptions/UnknownException.idl
* Montag, 12. November 2012 18:26 Uhr MEZ
*/

public final class UnknownException extends org.omg.CORBA.UserException
{

  public UnknownException ()
  {
    super(UnknownExceptionHelper.id());
  } // ctor


  public UnknownException (String $reason)
  {
    super(UnknownExceptionHelper.id() + "  " + $reason);
  } // ctor

} // class UnknownException

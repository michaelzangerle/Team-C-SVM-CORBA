package svm.corba.abstraction.exceptions;


/**
* svm/corba/abstraction/exceptions/AuthNotFoundException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from exceptions/AuthNotFoundException.idl
* Mittwoch, 14. November 2012 14:43 Uhr MEZ
*/

public final class AuthNotFoundException extends org.omg.CORBA.UserException
{

  public AuthNotFoundException ()
  {
    super(AuthNotFoundExceptionHelper.id());
  } // ctor


  public AuthNotFoundException (String $reason)
  {
    super(AuthNotFoundExceptionHelper.id() + "  " + $reason);
  } // ctor

} // class AuthNotFoundException

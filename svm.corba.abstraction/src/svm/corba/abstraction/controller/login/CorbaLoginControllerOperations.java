package svm.corba.abstraction.controller.login;


/**
* svm/corba/abstraction/controller/login/CorbaLoginControllerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from controller/CorbaLoginController.idl
* Dienstag, 13. November 2012 14:54 Uhr MEZ
*/

public interface CorbaLoginControllerOperations  extends svm.corba.abstraction.controller.ControllerOperations
{
  boolean login (String userName, String password) throws svm.corba.abstraction.exceptions.ControllerNotStartedException, svm.corba.abstraction.exceptions.UnknownException;
  boolean loginWithoutLdap (String userName, String password) throws svm.corba.abstraction.exceptions.ControllerNotStartedException, svm.corba.abstraction.exceptions.UnknownException;
  svm.corba.abstraction.cto.auth.CTOAuth getMember () throws svm.corba.abstraction.exceptions.RegisterException;
} // interface CorbaLoginControllerOperations

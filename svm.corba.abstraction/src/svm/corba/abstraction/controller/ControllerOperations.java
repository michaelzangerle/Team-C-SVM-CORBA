package svm.corba.abstraction.controller;


/**
* svm/corba/abstraction/controller/ControllerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from controller/Controller.idl
* Mittwoch, 14. November 2012 14:43 Uhr MEZ
*/

public interface ControllerOperations 
{
  void start () throws svm.corba.abstraction.exceptions.ControllerNotStartedException, svm.corba.abstraction.exceptions.UnknownException;
  void commit () throws svm.corba.abstraction.exceptions.ControllerNotStartedException;
  void abort () throws svm.corba.abstraction.exceptions.ControllerNotStartedException;
} // interface ControllerOperations

package svm.corba.abstraction.controller;


/**
* svm/corba/abstraction/controller/ControllerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from controller/Controller.idl
* Dienstag, 13. November 2012 15:48 Uhr MEZ
*/

public interface ControllerOperations 
{
  void start () throws svm.corba.abstraction.exceptions.ControllerNotStartedException, svm.corba.abstraction.exceptions.UnknownException;
  void commit () throws svm.corba.abstraction.exceptions.ControllerNotStartedException;
  void abort () throws svm.corba.abstraction.exceptions.ControllerNotStartedException;
} // interface ControllerOperations

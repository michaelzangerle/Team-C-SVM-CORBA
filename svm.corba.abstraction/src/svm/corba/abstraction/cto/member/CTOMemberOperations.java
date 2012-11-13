package svm.corba.abstraction.cto.member;


/**
* svm/corba/abstraction/cto/member/CTOMemberOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOMember.idl
* Dienstag, 13. November 2012 15:25 Uhr MEZ
*/

public interface CTOMemberOperations  extends svm.corba.abstraction.cto.CTOOperations
{
  String userName ();
  String firstName ();
  String lastName ();
  String title ();
  String socialNumber ();
  long birthDate ();
  String gender ();
  long entryDate ();
  String phone1 ();
  String phone2 ();
  String email1 ();
  String email2 ();
  String fax ();
  String street ();
  String streetNumber ();
  String coordLat ();
  String coordLong ();
  svm.corba.abstraction.cto.location.CTOLocation location ();
  boolean paid ();
} // interface CTOMemberOperations

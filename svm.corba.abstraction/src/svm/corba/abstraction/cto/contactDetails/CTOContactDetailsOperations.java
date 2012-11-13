package svm.corba.abstraction.cto.contactDetails;


/**
* svm/corba/abstraction/cto/contactDetails/CTOContactDetailsOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOContactDetails.idl
* Dienstag, 13. November 2012 15:25 Uhr MEZ
*/

public interface CTOContactDetailsOperations  extends svm.corba.abstraction.cto.CTOOperations
{
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
} // interface CTOContactDetailsOperations

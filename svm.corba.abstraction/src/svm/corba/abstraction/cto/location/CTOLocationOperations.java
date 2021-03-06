package svm.corba.abstraction.cto.location;


/**
* svm/corba/abstraction/cto/location/CTOLocationOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOLocation.idl
* Freitag, 16. November 2012 08:43 Uhr MEZ
*/

public interface CTOLocationOperations  extends svm.corba.abstraction.cto.CTOOperations
{
  String countryCode ();
  String postalCode ();
  String placeName ();
  String district ();
  String province ();
  String community ();
  String coordLat ();
  String coordLong ();
} // interface CTOLocationOperations

package svm.corba.abstraction.controller.member;


/**
* svm/corba/abstraction/controller/member/CorbaMemberControllerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from controller/CorbaMemberController.idl
* Dienstag, 13. November 2012 14:54 Uhr MEZ
*/

public interface CorbaMemberControllerOperations  extends svm.corba.abstraction.controller.ControllerOperations
{
  svm.corba.abstraction.cto.member.CTOMember getMember () throws svm.corba.abstraction.exceptions.RegisterException;
  void setTitle (String title) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setFirstName (String firstName) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setLastName (String lastName) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setSocialNumber (String socialNumber) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setBirthDate (long birthDate) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setGender (String gender) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setEntryDate (long entryDate) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setPhone1 (String phone1) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setPhone2 (String phone2) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setEmail1 (String email1) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setEmail2 (String email2) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setFax (String fax) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setStreet (String street) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setStreetNumber (String streetNumber) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setCoordLat (String coordLat) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setCoordLong (String coordLong) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setLocation (svm.corba.abstraction.cto.location.CTOLocation location) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
  void setPaidCurrentYear () throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException, svm.corba.abstraction.exceptions.UnknownException;
  void setUsername (String userName) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException;
} // interface CorbaMemberControllerOperations

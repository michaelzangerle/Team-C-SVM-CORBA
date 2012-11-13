package svm.corba.abstraction.cto.match;


/**
* svm/corba/abstraction/cto/match/CTOMatchOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOMatch.idl
* Dienstag, 13. November 2012 16:05 Uhr MEZ
*/

public interface CTOMatchOperations  extends svm.corba.abstraction.cto.CTOOperations
{
  String name ();
  long startDate ();
  long endDate ();
  boolean canceled ();
  String description ();
  String remarks ();
  int resultAway ();
  int resultHome ();
  svm.corba.abstraction.cto.team.CTOTeam getHomeTeam () throws svm.corba.abstraction.exceptions.LogicException;
  svm.corba.abstraction.cto.team.CTOTeam getAwayTeam () throws svm.corba.abstraction.exceptions.LogicException;
  svm.corba.abstraction.cto.matchType.CTOMatchType getMatchType () throws svm.corba.abstraction.exceptions.LogicException;
  svm.corba.abstraction.cto.contactDetails.CTOContactDetails getContactDetails () throws svm.corba.abstraction.exceptions.LogicException;
} // interface CTOMatchOperations

package svm.corba.abstraction;


/**
* svm/corba/abstraction/SVMExportOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Export.idl
* Dienstag, 13. November 2012 15:25 Uhr MEZ
*/

public interface SVMExportOperations 
{
  svm.corba.abstraction.sequences.Teams getListOfTeams ();
  svm.corba.abstraction.sequences.Contests getListOfContestsByDate (long date);
  svm.corba.abstraction.sequences.Contests getListOfContestsByTeam (svm.corba.abstraction.cto.team.CTOTeam team);
  svm.corba.abstraction.sequences.Matches getListOfMatches (svm.corba.abstraction.cto.contest.CTOContest contest);
} // interface SVMExportOperations

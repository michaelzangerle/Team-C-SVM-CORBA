package svm.corba.abstraction.sequences;


/**
* svm/corba/abstraction/sequences/Matches.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Export.idl
* Dienstag, 13. November 2012 15:48 Uhr MEZ
*/

public final class Matches implements org.omg.CORBA.portable.IDLEntity
{
  public svm.corba.abstraction.cto.match.CTOMatch matches[] = null;

  public Matches ()
  {
  } // ctor

  public Matches (svm.corba.abstraction.cto.match.CTOMatch[] _matches)
  {
    matches = _matches;
  } // ctor

} // class Matches

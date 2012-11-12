package svm.corba.abstraction;


/**
* svm/corba/abstraction/SVMExportPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Export.idl
* Montag, 12. November 2012 18:27 Uhr MEZ
*/

public abstract class SVMExportPOA extends org.omg.PortableServer.Servant
 implements svm.corba.abstraction.SVMExportOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getListOfTeams", new java.lang.Integer (0));
    _methods.put ("getListOfContestsByDate", new java.lang.Integer (1));
    _methods.put ("getListOfContestsByTeam", new java.lang.Integer (2));
    _methods.put ("getListOfMatches", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // svm/corba/abstraction/SVMExport/getListOfTeams
       {
         svm.corba.abstraction.sequences.Teams $result = null;
         $result = this.getListOfTeams ();
         out = $rh.createReply();
         svm.corba.abstraction.sequences.TeamsHelper.write (out, $result);
         break;
       }

       case 1:  // svm/corba/abstraction/SVMExport/getListOfContestsByDate
       {
         long date = in.read_longlong ();
         svm.corba.abstraction.sequences.Contests $result = null;
         $result = this.getListOfContestsByDate (date);
         out = $rh.createReply();
         svm.corba.abstraction.sequences.ContestsHelper.write (out, $result);
         break;
       }

       case 2:  // svm/corba/abstraction/SVMExport/getListOfContestsByTeam
       {
         svm.corba.abstraction.cto.team.CTOTeam team = svm.corba.abstraction.cto.team.CTOTeamHelper.read (in);
         svm.corba.abstraction.sequences.Contests $result = null;
         $result = this.getListOfContestsByTeam (team);
         out = $rh.createReply();
         svm.corba.abstraction.sequences.ContestsHelper.write (out, $result);
         break;
       }

       case 3:  // svm/corba/abstraction/SVMExport/getListOfMatches
       {
         svm.corba.abstraction.cto.contest.CTOContest contest = svm.corba.abstraction.cto.contest.CTOContestHelper.read (in);
         svm.corba.abstraction.sequences.Matches $result = null;
         $result = this.getListOfMatches (contest);
         out = $rh.createReply();
         svm.corba.abstraction.sequences.MatchesHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:svm/corba/abstraction/SVMExport:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public SVMExport _this() 
  {
    return SVMExportHelper.narrow(
    super._this_object());
  }

  public SVMExport _this(org.omg.CORBA.ORB orb) 
  {
    return SVMExportHelper.narrow(
    super._this_object(orb));
  }


} // class SVMExportPOA

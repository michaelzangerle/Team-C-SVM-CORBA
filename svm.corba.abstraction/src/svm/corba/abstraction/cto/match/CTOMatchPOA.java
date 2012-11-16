package svm.corba.abstraction.cto.match;


/**
* svm/corba/abstraction/cto/match/CTOMatchPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOMatch.idl
* Freitag, 16. November 2012 08:43 Uhr MEZ
*/

public abstract class CTOMatchPOA extends org.omg.PortableServer.Servant
 implements svm.corba.abstraction.cto.match.CTOMatchOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_name", new java.lang.Integer (0));
    _methods.put ("_get_startDate", new java.lang.Integer (1));
    _methods.put ("_get_endDate", new java.lang.Integer (2));
    _methods.put ("_get_canceled", new java.lang.Integer (3));
    _methods.put ("_get_description", new java.lang.Integer (4));
    _methods.put ("_get_remarks", new java.lang.Integer (5));
    _methods.put ("_get_phone1", new java.lang.Integer (6));
    _methods.put ("_get_phone2", new java.lang.Integer (7));
    _methods.put ("_get_email1", new java.lang.Integer (8));
    _methods.put ("_get_email2", new java.lang.Integer (9));
    _methods.put ("_get_fax", new java.lang.Integer (10));
    _methods.put ("_get_street", new java.lang.Integer (11));
    _methods.put ("_get_streetNumber", new java.lang.Integer (12));
    _methods.put ("_get_coordLat", new java.lang.Integer (13));
    _methods.put ("_get_coordLong", new java.lang.Integer (14));
    _methods.put ("_get_countryCode", new java.lang.Integer (15));
    _methods.put ("_get_postalCode", new java.lang.Integer (16));
    _methods.put ("_get_placeName", new java.lang.Integer (17));
    _methods.put ("_get_district", new java.lang.Integer (18));
    _methods.put ("_get_homeTeam", new java.lang.Integer (19));
    _methods.put ("_get_awayTeam", new java.lang.Integer (20));
    _methods.put ("_get_resultAway", new java.lang.Integer (21));
    _methods.put ("_get_resultHome", new java.lang.Integer (22));
    _methods.put ("_get_CTOid", new java.lang.Integer (23));
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
       case 0:  // svm/corba/abstraction/cto/match/CTOMatch/_get_name
       {
         String $result = null;
         $result = this.name ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // svm/corba/abstraction/cto/match/CTOMatch/_get_startDate
       {
         long $result = (long)0;
         $result = this.startDate ();
         out = $rh.createReply();
         out.write_longlong ($result);
         break;
       }

       case 2:  // svm/corba/abstraction/cto/match/CTOMatch/_get_endDate
       {
         long $result = (long)0;
         $result = this.endDate ();
         out = $rh.createReply();
         out.write_longlong ($result);
         break;
       }

       case 3:  // svm/corba/abstraction/cto/match/CTOMatch/_get_canceled
       {
         boolean $result = false;
         $result = this.canceled ();
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 4:  // svm/corba/abstraction/cto/match/CTOMatch/_get_description
       {
         String $result = null;
         $result = this.description ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 5:  // svm/corba/abstraction/cto/match/CTOMatch/_get_remarks
       {
         String $result = null;
         $result = this.remarks ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 6:  // svm/corba/abstraction/cto/match/CTOMatch/_get_phone1
       {
         String $result = null;
         $result = this.phone1 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 7:  // svm/corba/abstraction/cto/match/CTOMatch/_get_phone2
       {
         String $result = null;
         $result = this.phone2 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 8:  // svm/corba/abstraction/cto/match/CTOMatch/_get_email1
       {
         String $result = null;
         $result = this.email1 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 9:  // svm/corba/abstraction/cto/match/CTOMatch/_get_email2
       {
         String $result = null;
         $result = this.email2 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 10:  // svm/corba/abstraction/cto/match/CTOMatch/_get_fax
       {
         String $result = null;
         $result = this.fax ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 11:  // svm/corba/abstraction/cto/match/CTOMatch/_get_street
       {
         String $result = null;
         $result = this.street ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 12:  // svm/corba/abstraction/cto/match/CTOMatch/_get_streetNumber
       {
         String $result = null;
         $result = this.streetNumber ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 13:  // svm/corba/abstraction/cto/match/CTOMatch/_get_coordLat
       {
         String $result = null;
         $result = this.coordLat ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 14:  // svm/corba/abstraction/cto/match/CTOMatch/_get_coordLong
       {
         String $result = null;
         $result = this.coordLong ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 15:  // svm/corba/abstraction/cto/match/CTOMatch/_get_countryCode
       {
         String $result = null;
         $result = this.countryCode ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 16:  // svm/corba/abstraction/cto/match/CTOMatch/_get_postalCode
       {
         String $result = null;
         $result = this.postalCode ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 17:  // svm/corba/abstraction/cto/match/CTOMatch/_get_placeName
       {
         String $result = null;
         $result = this.placeName ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 18:  // svm/corba/abstraction/cto/match/CTOMatch/_get_district
       {
         String $result = null;
         $result = this.district ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 19:  // svm/corba/abstraction/cto/match/CTOMatch/_get_homeTeam
       {
         String $result = null;
         $result = this.homeTeam ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 20:  // svm/corba/abstraction/cto/match/CTOMatch/_get_awayTeam
       {
         String $result = null;
         $result = this.awayTeam ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 21:  // svm/corba/abstraction/cto/match/CTOMatch/_get_resultAway
       {
         int $result = (int)0;
         $result = this.resultAway ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 22:  // svm/corba/abstraction/cto/match/CTOMatch/_get_resultHome
       {
         int $result = (int)0;
         $result = this.resultHome ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 23:  // svm/corba/abstraction/cto/CTO/_get_CTOid
       {
         int $result = (int)0;
         $result = this.CTOid ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:svm/corba/abstraction/cto/match/CTOMatch:1.0", 
    "IDL:svm/corba/abstraction/cto/CTO:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CTOMatch _this() 
  {
    return CTOMatchHelper.narrow(
    super._this_object());
  }

  public CTOMatch _this(org.omg.CORBA.ORB orb) 
  {
    return CTOMatchHelper.narrow(
    super._this_object(orb));
  }


} // class CTOMatchPOA

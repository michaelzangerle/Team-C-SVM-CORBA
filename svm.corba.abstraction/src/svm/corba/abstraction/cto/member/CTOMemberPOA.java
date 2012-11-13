package svm.corba.abstraction.cto.member;


/**
* svm/corba/abstraction/cto/member/CTOMemberPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOMember.idl
* Dienstag, 13. November 2012 15:25 Uhr MEZ
*/

public abstract class CTOMemberPOA extends org.omg.PortableServer.Servant
 implements svm.corba.abstraction.cto.member.CTOMemberOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_userName", new java.lang.Integer (0));
    _methods.put ("_get_firstName", new java.lang.Integer (1));
    _methods.put ("_get_lastName", new java.lang.Integer (2));
    _methods.put ("_get_title", new java.lang.Integer (3));
    _methods.put ("_get_socialNumber", new java.lang.Integer (4));
    _methods.put ("_get_birthDate", new java.lang.Integer (5));
    _methods.put ("_get_gender", new java.lang.Integer (6));
    _methods.put ("_get_entryDate", new java.lang.Integer (7));
    _methods.put ("_get_phone1", new java.lang.Integer (8));
    _methods.put ("_get_phone2", new java.lang.Integer (9));
    _methods.put ("_get_email1", new java.lang.Integer (10));
    _methods.put ("_get_email2", new java.lang.Integer (11));
    _methods.put ("_get_fax", new java.lang.Integer (12));
    _methods.put ("_get_street", new java.lang.Integer (13));
    _methods.put ("_get_streetNumber", new java.lang.Integer (14));
    _methods.put ("_get_coordLat", new java.lang.Integer (15));
    _methods.put ("_get_coordLong", new java.lang.Integer (16));
    _methods.put ("_get_location", new java.lang.Integer (17));
    _methods.put ("_get_paid", new java.lang.Integer (18));
    _methods.put ("_get_CTOid", new java.lang.Integer (19));
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
       case 0:  // svm/corba/abstraction/cto/member/CTOMember/_get_userName
       {
         String $result = null;
         $result = this.userName ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // svm/corba/abstraction/cto/member/CTOMember/_get_firstName
       {
         String $result = null;
         $result = this.firstName ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // svm/corba/abstraction/cto/member/CTOMember/_get_lastName
       {
         String $result = null;
         $result = this.lastName ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // svm/corba/abstraction/cto/member/CTOMember/_get_title
       {
         String $result = null;
         $result = this.title ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 4:  // svm/corba/abstraction/cto/member/CTOMember/_get_socialNumber
       {
         String $result = null;
         $result = this.socialNumber ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 5:  // svm/corba/abstraction/cto/member/CTOMember/_get_birthDate
       {
         long $result = (long)0;
         $result = this.birthDate ();
         out = $rh.createReply();
         out.write_longlong ($result);
         break;
       }

       case 6:  // svm/corba/abstraction/cto/member/CTOMember/_get_gender
       {
         String $result = null;
         $result = this.gender ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 7:  // svm/corba/abstraction/cto/member/CTOMember/_get_entryDate
       {
         long $result = (long)0;
         $result = this.entryDate ();
         out = $rh.createReply();
         out.write_longlong ($result);
         break;
       }

       case 8:  // svm/corba/abstraction/cto/member/CTOMember/_get_phone1
       {
         String $result = null;
         $result = this.phone1 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 9:  // svm/corba/abstraction/cto/member/CTOMember/_get_phone2
       {
         String $result = null;
         $result = this.phone2 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 10:  // svm/corba/abstraction/cto/member/CTOMember/_get_email1
       {
         String $result = null;
         $result = this.email1 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 11:  // svm/corba/abstraction/cto/member/CTOMember/_get_email2
       {
         String $result = null;
         $result = this.email2 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 12:  // svm/corba/abstraction/cto/member/CTOMember/_get_fax
       {
         String $result = null;
         $result = this.fax ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 13:  // svm/corba/abstraction/cto/member/CTOMember/_get_street
       {
         String $result = null;
         $result = this.street ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 14:  // svm/corba/abstraction/cto/member/CTOMember/_get_streetNumber
       {
         String $result = null;
         $result = this.streetNumber ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 15:  // svm/corba/abstraction/cto/member/CTOMember/_get_coordLat
       {
         String $result = null;
         $result = this.coordLat ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 16:  // svm/corba/abstraction/cto/member/CTOMember/_get_coordLong
       {
         String $result = null;
         $result = this.coordLong ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 17:  // svm/corba/abstraction/cto/member/CTOMember/_get_location
       {
         svm.corba.abstraction.cto.location.CTOLocation $result = null;
         $result = this.location ();
         out = $rh.createReply();
         svm.corba.abstraction.cto.location.CTOLocationHelper.write (out, $result);
         break;
       }

       case 18:  // svm/corba/abstraction/cto/member/CTOMember/_get_paid
       {
         boolean $result = false;
         $result = this.paid ();
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 19:  // svm/corba/abstraction/cto/CTO/_get_CTOid
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
    "IDL:svm/corba/abstraction/cto/member/CTOMember:1.0", 
    "IDL:svm/corba/abstraction/cto/CTO:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CTOMember _this() 
  {
    return CTOMemberHelper.narrow(
    super._this_object());
  }

  public CTOMember _this(org.omg.CORBA.ORB orb) 
  {
    return CTOMemberHelper.narrow(
    super._this_object(orb));
  }


} // class CTOMemberPOA

package svm.corba.abstraction.cto.contactDetails;


/**
* svm/corba/abstraction/cto/contactDetails/CTOContactDetailsPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOContactDetails.idl
* Dienstag, 13. November 2012 15:25 Uhr MEZ
*/

public abstract class CTOContactDetailsPOA extends org.omg.PortableServer.Servant
 implements svm.corba.abstraction.cto.contactDetails.CTOContactDetailsOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_phone1", new java.lang.Integer (0));
    _methods.put ("_get_phone2", new java.lang.Integer (1));
    _methods.put ("_get_email1", new java.lang.Integer (2));
    _methods.put ("_get_email2", new java.lang.Integer (3));
    _methods.put ("_get_fax", new java.lang.Integer (4));
    _methods.put ("_get_street", new java.lang.Integer (5));
    _methods.put ("_get_streetNumber", new java.lang.Integer (6));
    _methods.put ("_get_coordLat", new java.lang.Integer (7));
    _methods.put ("_get_coordLong", new java.lang.Integer (8));
    _methods.put ("_get_location", new java.lang.Integer (9));
    _methods.put ("_get_CTOid", new java.lang.Integer (10));
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
       case 0:  // svm/corba/abstraction/cto/contactDetails/CTOContactDetails/_get_phone1
       {
         String $result = null;
         $result = this.phone1 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // svm/corba/abstraction/cto/contactDetails/CTOContactDetails/_get_phone2
       {
         String $result = null;
         $result = this.phone2 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // svm/corba/abstraction/cto/contactDetails/CTOContactDetails/_get_email1
       {
         String $result = null;
         $result = this.email1 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // svm/corba/abstraction/cto/contactDetails/CTOContactDetails/_get_email2
       {
         String $result = null;
         $result = this.email2 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 4:  // svm/corba/abstraction/cto/contactDetails/CTOContactDetails/_get_fax
       {
         String $result = null;
         $result = this.fax ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 5:  // svm/corba/abstraction/cto/contactDetails/CTOContactDetails/_get_street
       {
         String $result = null;
         $result = this.street ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 6:  // svm/corba/abstraction/cto/contactDetails/CTOContactDetails/_get_streetNumber
       {
         String $result = null;
         $result = this.streetNumber ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 7:  // svm/corba/abstraction/cto/contactDetails/CTOContactDetails/_get_coordLat
       {
         String $result = null;
         $result = this.coordLat ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 8:  // svm/corba/abstraction/cto/contactDetails/CTOContactDetails/_get_coordLong
       {
         String $result = null;
         $result = this.coordLong ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 9:  // svm/corba/abstraction/cto/contactDetails/CTOContactDetails/_get_location
       {
         svm.corba.abstraction.cto.location.CTOLocation $result = null;
         $result = this.location ();
         out = $rh.createReply();
         svm.corba.abstraction.cto.location.CTOLocationHelper.write (out, $result);
         break;
       }

       case 10:  // svm/corba/abstraction/cto/CTO/_get_CTOid
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
    "IDL:svm/corba/abstraction/cto/contactDetails/CTOContactDetails:1.0", 
    "IDL:svm/corba/abstraction/cto/CTO:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CTOContactDetails _this() 
  {
    return CTOContactDetailsHelper.narrow(
    super._this_object());
  }

  public CTOContactDetails _this(org.omg.CORBA.ORB orb) 
  {
    return CTOContactDetailsHelper.narrow(
    super._this_object(orb));
  }


} // class CTOContactDetailsPOA

package svm.corba.abstraction.cto.auth;


/**
* svm/corba/abstraction/cto/auth/CTOAuthPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOAuth.idl
* Mittwoch, 14. November 2012 08:42 Uhr MEZ
*/

public abstract class CTOAuthPOA extends org.omg.PortableServer.Servant
 implements svm.corba.abstraction.cto.auth.CTOAuthOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_firstName", new java.lang.Integer (0));
    _methods.put ("_get_lastName", new java.lang.Integer (1));
    _methods.put ("_get_username", new java.lang.Integer (2));
    _methods.put ("_get_title", new java.lang.Integer (3));
    _methods.put ("_get_CTOid", new java.lang.Integer (4));
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
       case 0:  // svm/corba/abstraction/cto/auth/CTOAuth/_get_firstName
       {
         String $result = null;
         $result = this.firstName ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // svm/corba/abstraction/cto/auth/CTOAuth/_get_lastName
       {
         String $result = null;
         $result = this.lastName ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // svm/corba/abstraction/cto/auth/CTOAuth/_get_username
       {
         String $result = null;
         $result = this.username ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // svm/corba/abstraction/cto/auth/CTOAuth/_get_title
       {
         String $result = null;
         $result = this.title ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 4:  // svm/corba/abstraction/cto/CTO/_get_CTOid
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
    "IDL:svm/corba/abstraction/cto/auth/CTOAuth:1.0", 
    "IDL:svm/corba/abstraction/cto/CTO:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CTOAuth _this() 
  {
    return CTOAuthHelper.narrow(
    super._this_object());
  }

  public CTOAuth _this(org.omg.CORBA.ORB orb) 
  {
    return CTOAuthHelper.narrow(
    super._this_object(orb));
  }


} // class CTOAuthPOA

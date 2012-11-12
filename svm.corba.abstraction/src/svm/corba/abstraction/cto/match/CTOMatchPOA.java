package svm.corba.abstraction.cto.match;


/**
* svm/corba/abstraction/cto/match/CTOMatchPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOMatch.idl
* Montag, 12. November 2012 18:26 Uhr MEZ
*/

public abstract class CTOMatchPOA extends org.omg.PortableServer.Servant
 implements svm.corba.abstraction.cto.match.CTOMatchOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_CTOid", new java.lang.Integer (0));
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
       case 0:  // svm/corba/abstraction/cto/CTO/_get_CTOid
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

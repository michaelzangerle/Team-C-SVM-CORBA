package svm.corba.abstraction.cto.matchType;


/**
* svm/corba/abstraction/cto/matchType/CTOMatchTypePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOMatchType.idl
* Dienstag, 13. November 2012 16:05 Uhr MEZ
*/

public abstract class CTOMatchTypePOA extends org.omg.PortableServer.Servant
 implements svm.corba.abstraction.cto.matchType.CTOMatchTypeOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_name", new java.lang.Integer (0));
    _methods.put ("_get_CTOid", new java.lang.Integer (1));
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
       case 0:  // svm/corba/abstraction/cto/matchType/CTOMatchType/_get_name
       {
         String $result = null;
         $result = this.name ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // svm/corba/abstraction/cto/CTO/_get_CTOid
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
    "IDL:svm/corba/abstraction/cto/matchType/CTOMatchType:1.0", 
    "IDL:svm/corba/abstraction/cto/CTO:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CTOMatchType _this() 
  {
    return CTOMatchTypeHelper.narrow(
    super._this_object());
  }

  public CTOMatchType _this(org.omg.CORBA.ORB orb) 
  {
    return CTOMatchTypeHelper.narrow(
    super._this_object(orb));
  }


} // class CTOMatchTypePOA

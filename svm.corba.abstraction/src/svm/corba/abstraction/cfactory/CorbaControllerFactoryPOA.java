package svm.corba.abstraction.cfactory;


/**
* svm/corba/abstraction/cfactory/CorbaControllerFactoryPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CorbaControllerFactory.idl
* Freitag, 16. November 2012 08:43 Uhr MEZ
*/

public abstract class CorbaControllerFactoryPOA extends org.omg.PortableServer.Servant
 implements svm.corba.abstraction.cfactory.CorbaControllerFactoryOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getCorbaLoginController", new java.lang.Integer (0));
    _methods.put ("getMemberController", new java.lang.Integer (1));
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
       case 0:  // svm/corba/abstraction/cfactory/CorbaControllerFactory/getCorbaLoginController
       {
         try {
           svm.corba.abstraction.controller.login.CorbaLoginController $result = null;
           $result = this.getCorbaLoginController ();
           out = $rh.createReply();
           svm.corba.abstraction.controller.login.CorbaLoginControllerHelper.write (out, $result);
         } catch (svm.corba.abstraction.exceptions.RegisterException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.RegisterExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // svm/corba/abstraction/cfactory/CorbaControllerFactory/getMemberController
       {
         try {
           svm.corba.abstraction.cto.auth.CTOAuth auth = svm.corba.abstraction.cto.auth.CTOAuthHelper.read (in);
           svm.corba.abstraction.controller.member.CorbaMemberController $result = null;
           $result = this.getMemberController (auth);
           out = $rh.createReply();
           svm.corba.abstraction.controller.member.CorbaMemberControllerHelper.write (out, $result);
         } catch (svm.corba.abstraction.exceptions.RegisterException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.RegisterExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AuthNotFoundException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AuthNotFoundExceptionHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:svm/corba/abstraction/cfactory/CorbaControllerFactory:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CorbaControllerFactory _this() 
  {
    return CorbaControllerFactoryHelper.narrow(
    super._this_object());
  }

  public CorbaControllerFactory _this(org.omg.CORBA.ORB orb) 
  {
    return CorbaControllerFactoryHelper.narrow(
    super._this_object(orb));
  }


} // class CorbaControllerFactoryPOA

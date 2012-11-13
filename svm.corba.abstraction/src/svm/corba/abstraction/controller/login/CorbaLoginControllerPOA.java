package svm.corba.abstraction.controller.login;


/**
* svm/corba/abstraction/controller/login/CorbaLoginControllerPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from controller/CorbaLoginController.idl
* Dienstag, 13. November 2012 15:48 Uhr MEZ
*/

public abstract class CorbaLoginControllerPOA extends org.omg.PortableServer.Servant
 implements svm.corba.abstraction.controller.login.CorbaLoginControllerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("login", new java.lang.Integer (0));
    _methods.put ("loginWithoutLdap", new java.lang.Integer (1));
    _methods.put ("getMember", new java.lang.Integer (2));
    _methods.put ("start", new java.lang.Integer (3));
    _methods.put ("commit", new java.lang.Integer (4));
    _methods.put ("abort", new java.lang.Integer (5));
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
       case 0:  // svm/corba/abstraction/controller/login/CorbaLoginController/login
       {
         try {
           String userName = in.read_string ();
           String password = in.read_string ();
           boolean $result = false;
           $result = this.login (userName, password);
           out = $rh.createReply();
           out.write_boolean ($result);
         } catch (svm.corba.abstraction.exceptions.ControllerNotStartedException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.ControllerNotStartedExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.UnknownException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.UnknownExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // svm/corba/abstraction/controller/login/CorbaLoginController/loginWithoutLdap
       {
         try {
           String userName = in.read_string ();
           String password = in.read_string ();
           boolean $result = false;
           $result = this.loginWithoutLdap (userName, password);
           out = $rh.createReply();
           out.write_boolean ($result);
         } catch (svm.corba.abstraction.exceptions.ControllerNotStartedException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.ControllerNotStartedExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.UnknownException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.UnknownExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // svm/corba/abstraction/controller/login/CorbaLoginController/getMember
       {
         try {
           svm.corba.abstraction.cto.auth.CTOAuth $result = null;
           $result = this.getMember ();
           out = $rh.createReply();
           svm.corba.abstraction.cto.auth.CTOAuthHelper.write (out, $result);
         } catch (svm.corba.abstraction.exceptions.RegisterException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.RegisterExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 3:  // svm/corba/abstraction/controller/Controller/start
       {
         try {
           this.start ();
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.ControllerNotStartedException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.ControllerNotStartedExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.UnknownException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.UnknownExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 4:  // svm/corba/abstraction/controller/Controller/commit
       {
         try {
           this.commit ();
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.ControllerNotStartedException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.ControllerNotStartedExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 5:  // svm/corba/abstraction/controller/Controller/abort
       {
         try {
           this.abort ();
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.ControllerNotStartedException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.ControllerNotStartedExceptionHelper.write (out, $ex);
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
    "IDL:svm/corba/abstraction/controller/login/CorbaLoginController:1.0", 
    "IDL:svm/corba/abstraction/controller/Controller:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CorbaLoginController _this() 
  {
    return CorbaLoginControllerHelper.narrow(
    super._this_object());
  }

  public CorbaLoginController _this(org.omg.CORBA.ORB orb) 
  {
    return CorbaLoginControllerHelper.narrow(
    super._this_object(orb));
  }


} // class CorbaLoginControllerPOA

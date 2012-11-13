package svm.corba.abstraction.cfactory;


/**
* svm/corba/abstraction/cfactory/_CorbaControllerFactoryStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CorbaControllerFactory.idl
* Dienstag, 13. November 2012 15:25 Uhr MEZ
*/

public class _CorbaControllerFactoryStub extends org.omg.CORBA.portable.ObjectImpl implements svm.corba.abstraction.cfactory.CorbaControllerFactory
{

  public svm.corba.abstraction.controller.login.CorbaLoginController getCorbaLoginController () throws svm.corba.abstraction.exceptions.RegisterException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getCorbaLoginController", true);
                $in = _invoke ($out);
                svm.corba.abstraction.controller.login.CorbaLoginController $result = svm.corba.abstraction.controller.login.CorbaLoginControllerHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/RegisterException:1.0"))
                    throw svm.corba.abstraction.exceptions.RegisterExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getCorbaLoginController (        );
            } finally {
                _releaseReply ($in);
            }
  } // getCorbaLoginController

  public svm.corba.abstraction.controller.member.CorbaMemberController getMemberController (svm.corba.abstraction.cto.auth.CTOAuth auth) throws svm.corba.abstraction.exceptions.RegisterException, svm.corba.abstraction.exceptions.AuthNotFoundException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getMemberController", true);
                svm.corba.abstraction.cto.auth.CTOAuthHelper.write ($out, auth);
                $in = _invoke ($out);
                svm.corba.abstraction.controller.member.CorbaMemberController $result = svm.corba.abstraction.controller.member.CorbaMemberControllerHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/RegisterException:1.0"))
                    throw svm.corba.abstraction.exceptions.RegisterExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AuthNotFoundException:1.0"))
                    throw svm.corba.abstraction.exceptions.AuthNotFoundExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getMemberController (auth        );
            } finally {
                _releaseReply ($in);
            }
  } // getMemberController

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:svm/corba/abstraction/cfactory/CorbaControllerFactory:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _CorbaControllerFactoryStub

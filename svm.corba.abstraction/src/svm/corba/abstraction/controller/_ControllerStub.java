package svm.corba.abstraction.controller;


/**
* svm/corba/abstraction/controller/_ControllerStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from controller/Controller.idl
* Montag, 12. November 2012 18:27 Uhr MEZ
*/

public class _ControllerStub extends org.omg.CORBA.portable.ObjectImpl implements svm.corba.abstraction.controller.Controller
{

  public void start () throws svm.corba.abstraction.exceptions.ControllerNotStartedException, svm.corba.abstraction.exceptions.UnknownException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("start", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/ControllerNotStartedException:1.0"))
                    throw svm.corba.abstraction.exceptions.ControllerNotStartedExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/UnknownException:1.0"))
                    throw svm.corba.abstraction.exceptions.UnknownExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                start (        );
            } finally {
                _releaseReply ($in);
            }
  } // start

  public void commit () throws svm.corba.abstraction.exceptions.ControllerNotStartedException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("commit", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/ControllerNotStartedException:1.0"))
                    throw svm.corba.abstraction.exceptions.ControllerNotStartedExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                commit (        );
            } finally {
                _releaseReply ($in);
            }
  } // commit

  public void abort () throws svm.corba.abstraction.exceptions.ControllerNotStartedException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("abort", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/ControllerNotStartedException:1.0"))
                    throw svm.corba.abstraction.exceptions.ControllerNotStartedExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                abort (        );
            } finally {
                _releaseReply ($in);
            }
  } // abort

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:svm/corba/abstraction/controller/Controller:1.0"};

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
} // class _ControllerStub

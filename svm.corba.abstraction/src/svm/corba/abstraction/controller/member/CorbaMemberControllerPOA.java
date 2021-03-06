package svm.corba.abstraction.controller.member;


/**
* svm/corba/abstraction/controller/member/CorbaMemberControllerPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from controller/CorbaMemberController.idl
* Freitag, 16. November 2012 08:43 Uhr MEZ
*/

public abstract class CorbaMemberControllerPOA extends org.omg.PortableServer.Servant
 implements svm.corba.abstraction.controller.member.CorbaMemberControllerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getMember", new java.lang.Integer (0));
    _methods.put ("setTitle", new java.lang.Integer (1));
    _methods.put ("setFirstName", new java.lang.Integer (2));
    _methods.put ("setLastName", new java.lang.Integer (3));
    _methods.put ("setSocialNumber", new java.lang.Integer (4));
    _methods.put ("setBirthDate", new java.lang.Integer (5));
    _methods.put ("setGender", new java.lang.Integer (6));
    _methods.put ("setEntryDate", new java.lang.Integer (7));
    _methods.put ("setPhone1", new java.lang.Integer (8));
    _methods.put ("setPhone2", new java.lang.Integer (9));
    _methods.put ("setEmail1", new java.lang.Integer (10));
    _methods.put ("setEmail2", new java.lang.Integer (11));
    _methods.put ("setFax", new java.lang.Integer (12));
    _methods.put ("setStreet", new java.lang.Integer (13));
    _methods.put ("setStreetNumber", new java.lang.Integer (14));
    _methods.put ("setCoordLat", new java.lang.Integer (15));
    _methods.put ("setCoordLong", new java.lang.Integer (16));
    _methods.put ("setLocation", new java.lang.Integer (17));
    _methods.put ("setPaidCurrentYear", new java.lang.Integer (18));
    _methods.put ("setUsername", new java.lang.Integer (19));
    _methods.put ("start", new java.lang.Integer (20));
    _methods.put ("commit", new java.lang.Integer (21));
    _methods.put ("abort", new java.lang.Integer (22));
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
       case 0:  // svm/corba/abstraction/controller/member/CorbaMemberController/getMember
       {
         try {
           svm.corba.abstraction.cto.member.CTOMember $result = null;
           $result = this.getMember ();
           out = $rh.createReply();
           svm.corba.abstraction.cto.member.CTOMemberHelper.write (out, $result);
         } catch (svm.corba.abstraction.exceptions.RegisterException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.RegisterExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // svm/corba/abstraction/controller/member/CorbaMemberController/setTitle
       {
         try {
           String title = in.read_string ();
           this.setTitle (title);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // svm/corba/abstraction/controller/member/CorbaMemberController/setFirstName
       {
         try {
           String firstName = in.read_string ();
           this.setFirstName (firstName);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 3:  // svm/corba/abstraction/controller/member/CorbaMemberController/setLastName
       {
         try {
           String lastName = in.read_string ();
           this.setLastName (lastName);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 4:  // svm/corba/abstraction/controller/member/CorbaMemberController/setSocialNumber
       {
         try {
           String socialNumber = in.read_string ();
           this.setSocialNumber (socialNumber);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 5:  // svm/corba/abstraction/controller/member/CorbaMemberController/setBirthDate
       {
         try {
           long birthDate = in.read_longlong ();
           this.setBirthDate (birthDate);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 6:  // svm/corba/abstraction/controller/member/CorbaMemberController/setGender
       {
         try {
           String gender = in.read_string ();
           this.setGender (gender);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 7:  // svm/corba/abstraction/controller/member/CorbaMemberController/setEntryDate
       {
         try {
           long entryDate = in.read_longlong ();
           this.setEntryDate (entryDate);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 8:  // svm/corba/abstraction/controller/member/CorbaMemberController/setPhone1
       {
         try {
           String phone1 = in.read_string ();
           this.setPhone1 (phone1);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 9:  // svm/corba/abstraction/controller/member/CorbaMemberController/setPhone2
       {
         try {
           String phone2 = in.read_string ();
           this.setPhone2 (phone2);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 10:  // svm/corba/abstraction/controller/member/CorbaMemberController/setEmail1
       {
         try {
           String email1 = in.read_string ();
           this.setEmail1 (email1);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 11:  // svm/corba/abstraction/controller/member/CorbaMemberController/setEmail2
       {
         try {
           String email2 = in.read_string ();
           this.setEmail2 (email2);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 12:  // svm/corba/abstraction/controller/member/CorbaMemberController/setFax
       {
         try {
           String fax = in.read_string ();
           this.setFax (fax);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 13:  // svm/corba/abstraction/controller/member/CorbaMemberController/setStreet
       {
         try {
           String street = in.read_string ();
           this.setStreet (street);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 14:  // svm/corba/abstraction/controller/member/CorbaMemberController/setStreetNumber
       {
         try {
           String streetNumber = in.read_string ();
           this.setStreetNumber (streetNumber);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 15:  // svm/corba/abstraction/controller/member/CorbaMemberController/setCoordLat
       {
         try {
           String coordLat = in.read_string ();
           this.setCoordLat (coordLat);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 16:  // svm/corba/abstraction/controller/member/CorbaMemberController/setCoordLong
       {
         try {
           String coordLong = in.read_string ();
           this.setCoordLong (coordLong);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 17:  // svm/corba/abstraction/controller/member/CorbaMemberController/setLocation
       {
         try {
           svm.corba.abstraction.cto.location.CTOLocation location = svm.corba.abstraction.cto.location.CTOLocationHelper.read (in);
           this.setLocation (location);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 18:  // svm/corba/abstraction/controller/member/CorbaMemberController/setPaidCurrentYear
       {
         try {
           this.setPaidCurrentYear ();
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.UnknownException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.UnknownExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 19:  // svm/corba/abstraction/controller/member/CorbaMemberController/setUsername
       {
         try {
           String userName = in.read_string ();
           this.setUsername (userName);
           out = $rh.createReply();
         } catch (svm.corba.abstraction.exceptions.NotAllowException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.NotAllowExceptionHelper.write (out, $ex);
         } catch (svm.corba.abstraction.exceptions.AttributeException $ex) {
           out = $rh.createExceptionReply ();
           svm.corba.abstraction.exceptions.AttributeExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 20:  // svm/corba/abstraction/controller/Controller/start
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

       case 21:  // svm/corba/abstraction/controller/Controller/commit
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

       case 22:  // svm/corba/abstraction/controller/Controller/abort
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
    "IDL:svm/corba/abstraction/controller/member/CorbaMemberController:1.0", 
    "IDL:svm/corba/abstraction/controller/Controller:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CorbaMemberController _this() 
  {
    return CorbaMemberControllerHelper.narrow(
    super._this_object());
  }

  public CorbaMemberController _this(org.omg.CORBA.ORB orb) 
  {
    return CorbaMemberControllerHelper.narrow(
    super._this_object(orb));
  }


} // class CorbaMemberControllerPOA

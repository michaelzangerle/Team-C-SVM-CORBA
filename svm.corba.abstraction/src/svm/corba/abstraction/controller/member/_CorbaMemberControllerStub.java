package svm.corba.abstraction.controller.member;


/**
* svm/corba/abstraction/controller/member/_CorbaMemberControllerStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from controller/CorbaMemberController.idl
* Freitag, 16. November 2012 08:43 Uhr MEZ
*/

public class _CorbaMemberControllerStub extends org.omg.CORBA.portable.ObjectImpl implements svm.corba.abstraction.controller.member.CorbaMemberController
{

  public svm.corba.abstraction.cto.member.CTOMember getMember () throws svm.corba.abstraction.exceptions.RegisterException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getMember", true);
                $in = _invoke ($out);
                svm.corba.abstraction.cto.member.CTOMember $result = svm.corba.abstraction.cto.member.CTOMemberHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/RegisterException:1.0"))
                    throw svm.corba.abstraction.exceptions.RegisterExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getMember (        );
            } finally {
                _releaseReply ($in);
            }
  } // getMember

  public void setTitle (String title) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setTitle", true);
                $out.write_string (title);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setTitle (title        );
            } finally {
                _releaseReply ($in);
            }
  } // setTitle

  public void setFirstName (String firstName) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setFirstName", true);
                $out.write_string (firstName);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setFirstName (firstName        );
            } finally {
                _releaseReply ($in);
            }
  } // setFirstName

  public void setLastName (String lastName) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setLastName", true);
                $out.write_string (lastName);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setLastName (lastName        );
            } finally {
                _releaseReply ($in);
            }
  } // setLastName

  public void setSocialNumber (String socialNumber) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setSocialNumber", true);
                $out.write_string (socialNumber);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setSocialNumber (socialNumber        );
            } finally {
                _releaseReply ($in);
            }
  } // setSocialNumber

  public void setBirthDate (long birthDate) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setBirthDate", true);
                $out.write_longlong (birthDate);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setBirthDate (birthDate        );
            } finally {
                _releaseReply ($in);
            }
  } // setBirthDate

  public void setGender (String gender) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setGender", true);
                $out.write_string (gender);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setGender (gender        );
            } finally {
                _releaseReply ($in);
            }
  } // setGender

  public void setEntryDate (long entryDate) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setEntryDate", true);
                $out.write_longlong (entryDate);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setEntryDate (entryDate        );
            } finally {
                _releaseReply ($in);
            }
  } // setEntryDate

  public void setPhone1 (String phone1) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setPhone1", true);
                $out.write_string (phone1);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setPhone1 (phone1        );
            } finally {
                _releaseReply ($in);
            }
  } // setPhone1

  public void setPhone2 (String phone2) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setPhone2", true);
                $out.write_string (phone2);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setPhone2 (phone2        );
            } finally {
                _releaseReply ($in);
            }
  } // setPhone2

  public void setEmail1 (String email1) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setEmail1", true);
                $out.write_string (email1);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setEmail1 (email1        );
            } finally {
                _releaseReply ($in);
            }
  } // setEmail1

  public void setEmail2 (String email2) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setEmail2", true);
                $out.write_string (email2);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setEmail2 (email2        );
            } finally {
                _releaseReply ($in);
            }
  } // setEmail2

  public void setFax (String fax) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setFax", true);
                $out.write_string (fax);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setFax (fax        );
            } finally {
                _releaseReply ($in);
            }
  } // setFax

  public void setStreet (String street) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setStreet", true);
                $out.write_string (street);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setStreet (street        );
            } finally {
                _releaseReply ($in);
            }
  } // setStreet

  public void setStreetNumber (String streetNumber) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setStreetNumber", true);
                $out.write_string (streetNumber);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setStreetNumber (streetNumber        );
            } finally {
                _releaseReply ($in);
            }
  } // setStreetNumber

  public void setCoordLat (String coordLat) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setCoordLat", true);
                $out.write_string (coordLat);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setCoordLat (coordLat        );
            } finally {
                _releaseReply ($in);
            }
  } // setCoordLat

  public void setCoordLong (String coordLong) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setCoordLong", true);
                $out.write_string (coordLong);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setCoordLong (coordLong        );
            } finally {
                _releaseReply ($in);
            }
  } // setCoordLong

  public void setLocation (svm.corba.abstraction.cto.location.CTOLocation location) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setLocation", true);
                svm.corba.abstraction.cto.location.CTOLocationHelper.write ($out, location);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setLocation (location        );
            } finally {
                _releaseReply ($in);
            }
  } // setLocation

  public void setPaidCurrentYear () throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException, svm.corba.abstraction.exceptions.UnknownException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setPaidCurrentYear", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/UnknownException:1.0"))
                    throw svm.corba.abstraction.exceptions.UnknownExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setPaidCurrentYear (        );
            } finally {
                _releaseReply ($in);
            }
  } // setPaidCurrentYear

  public void setUsername (String userName) throws svm.corba.abstraction.exceptions.NotAllowException, svm.corba.abstraction.exceptions.AttributeException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setUsername", true);
                $out.write_string (userName);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:svm/corba/abstraction/exceptions/NotAllowException:1.0"))
                    throw svm.corba.abstraction.exceptions.NotAllowExceptionHelper.read ($in);
                else if (_id.equals ("IDL:svm/corba/abstraction/exceptions/AttributeException:1.0"))
                    throw svm.corba.abstraction.exceptions.AttributeExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setUsername (userName        );
            } finally {
                _releaseReply ($in);
            }
  } // setUsername

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
    "IDL:svm/corba/abstraction/controller/member/CorbaMemberController:1.0", 
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
} // class _CorbaMemberControllerStub

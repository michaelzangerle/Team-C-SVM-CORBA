package svm.corba.abstraction.exceptions;


/**
* svm/corba/abstraction/exceptions/UnknownExceptionHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from exceptions/UnknownException.idl
* Sonntag, 11. November 2012 18:20 Uhr MEZ
*/

abstract public class UnknownExceptionHelper
{
  private static String  _id = "IDL:svm/corba/abstraction/exceptions/UnknownException:1.0";

  public static void insert (org.omg.CORBA.Any a, svm.corba.abstraction.exceptions.UnknownException that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static svm.corba.abstraction.exceptions.UnknownException extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [0];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (svm.corba.abstraction.exceptions.UnknownExceptionHelper.id (), "UnknownException", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static svm.corba.abstraction.exceptions.UnknownException read (org.omg.CORBA.portable.InputStream istream)
  {
    svm.corba.abstraction.exceptions.UnknownException value = new svm.corba.abstraction.exceptions.UnknownException ();
    // read and discard the repository ID
    istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, svm.corba.abstraction.exceptions.UnknownException value)
  {
    // write the repository ID
    ostream.write_string (id ());
  }

}

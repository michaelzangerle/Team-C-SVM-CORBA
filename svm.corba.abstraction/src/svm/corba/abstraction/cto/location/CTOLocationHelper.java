package svm.corba.abstraction.cto.location;


/**
* svm/corba/abstraction/cto/location/CTOLocationHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOLocation.idl
* Dienstag, 13. November 2012 16:05 Uhr MEZ
*/

abstract public class CTOLocationHelper
{
  private static String  _id = "IDL:svm/corba/abstraction/cto/location/CTOLocation:1.0";

  public static void insert (org.omg.CORBA.Any a, svm.corba.abstraction.cto.location.CTOLocation that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static svm.corba.abstraction.cto.location.CTOLocation extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (svm.corba.abstraction.cto.location.CTOLocationHelper.id (), "CTOLocation");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static svm.corba.abstraction.cto.location.CTOLocation read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CTOLocationStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, svm.corba.abstraction.cto.location.CTOLocation value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static svm.corba.abstraction.cto.location.CTOLocation narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof svm.corba.abstraction.cto.location.CTOLocation)
      return (svm.corba.abstraction.cto.location.CTOLocation)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      svm.corba.abstraction.cto.location._CTOLocationStub stub = new svm.corba.abstraction.cto.location._CTOLocationStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static svm.corba.abstraction.cto.location.CTOLocation unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof svm.corba.abstraction.cto.location.CTOLocation)
      return (svm.corba.abstraction.cto.location.CTOLocation)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      svm.corba.abstraction.cto.location._CTOLocationStub stub = new svm.corba.abstraction.cto.location._CTOLocationStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}

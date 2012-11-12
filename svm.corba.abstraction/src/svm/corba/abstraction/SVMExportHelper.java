package svm.corba.abstraction;


/**
* svm/corba/abstraction/SVMExportHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Export.idl
* Montag, 12. November 2012 18:27 Uhr MEZ
*/

abstract public class SVMExportHelper
{
  private static String  _id = "IDL:svm/corba/abstraction/SVMExport:1.0";

  public static void insert (org.omg.CORBA.Any a, svm.corba.abstraction.SVMExport that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static svm.corba.abstraction.SVMExport extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (svm.corba.abstraction.SVMExportHelper.id (), "SVMExport");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static svm.corba.abstraction.SVMExport read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_SVMExportStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, svm.corba.abstraction.SVMExport value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static svm.corba.abstraction.SVMExport narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof svm.corba.abstraction.SVMExport)
      return (svm.corba.abstraction.SVMExport)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      svm.corba.abstraction._SVMExportStub stub = new svm.corba.abstraction._SVMExportStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static svm.corba.abstraction.SVMExport unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof svm.corba.abstraction.SVMExport)
      return (svm.corba.abstraction.SVMExport)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      svm.corba.abstraction._SVMExportStub stub = new svm.corba.abstraction._SVMExportStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}

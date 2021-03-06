package svm.corba.abstraction.controller.member;


/**
* svm/corba/abstraction/controller/member/CorbaMemberControllerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from controller/CorbaMemberController.idl
* Freitag, 16. November 2012 08:43 Uhr MEZ
*/

abstract public class CorbaMemberControllerHelper
{
  private static String  _id = "IDL:svm/corba/abstraction/controller/member/CorbaMemberController:1.0";

  public static void insert (org.omg.CORBA.Any a, svm.corba.abstraction.controller.member.CorbaMemberController that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static svm.corba.abstraction.controller.member.CorbaMemberController extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (svm.corba.abstraction.controller.member.CorbaMemberControllerHelper.id (), "CorbaMemberController");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static svm.corba.abstraction.controller.member.CorbaMemberController read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CorbaMemberControllerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, svm.corba.abstraction.controller.member.CorbaMemberController value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static svm.corba.abstraction.controller.member.CorbaMemberController narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof svm.corba.abstraction.controller.member.CorbaMemberController)
      return (svm.corba.abstraction.controller.member.CorbaMemberController)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      svm.corba.abstraction.controller.member._CorbaMemberControllerStub stub = new svm.corba.abstraction.controller.member._CorbaMemberControllerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static svm.corba.abstraction.controller.member.CorbaMemberController unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof svm.corba.abstraction.controller.member.CorbaMemberController)
      return (svm.corba.abstraction.controller.member.CorbaMemberController)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      svm.corba.abstraction.controller.member._CorbaMemberControllerStub stub = new svm.corba.abstraction.controller.member._CorbaMemberControllerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}

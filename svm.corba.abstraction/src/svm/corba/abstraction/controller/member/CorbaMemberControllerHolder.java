package svm.corba.abstraction.controller.member;

/**
* svm/corba/abstraction/controller/member/CorbaMemberControllerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from controller/CorbaMemberController.idl
* Freitag, 16. November 2012 08:43 Uhr MEZ
*/

public final class CorbaMemberControllerHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.controller.member.CorbaMemberController value = null;

  public CorbaMemberControllerHolder ()
  {
  }

  public CorbaMemberControllerHolder (svm.corba.abstraction.controller.member.CorbaMemberController initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.controller.member.CorbaMemberControllerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.controller.member.CorbaMemberControllerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.controller.member.CorbaMemberControllerHelper.type ();
  }

}

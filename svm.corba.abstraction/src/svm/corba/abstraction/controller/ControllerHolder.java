package svm.corba.abstraction.controller;

/**
* svm/corba/abstraction/controller/ControllerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from controller/Controller.idl
* Dienstag, 13. November 2012 16:05 Uhr MEZ
*/

public final class ControllerHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.controller.Controller value = null;

  public ControllerHolder ()
  {
  }

  public ControllerHolder (svm.corba.abstraction.controller.Controller initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.controller.ControllerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.controller.ControllerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.controller.ControllerHelper.type ();
  }

}

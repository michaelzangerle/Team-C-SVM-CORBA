package svm.corba.abstraction;

/**
* svm/corba/abstraction/SVMExportHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Export.idl
* Dienstag, 13. November 2012 15:25 Uhr MEZ
*/

public final class SVMExportHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.SVMExport value = null;

  public SVMExportHolder ()
  {
  }

  public SVMExportHolder (svm.corba.abstraction.SVMExport initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.SVMExportHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.SVMExportHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.SVMExportHelper.type ();
  }

}

package svm.corba.abstraction.cto.member;

/**
* svm/corba/abstraction/cto/member/CTOMemberHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cto/CTOMember.idl
* Dienstag, 13. November 2012 16:05 Uhr MEZ
*/

public final class CTOMemberHolder implements org.omg.CORBA.portable.Streamable
{
  public svm.corba.abstraction.cto.member.CTOMember value = null;

  public CTOMemberHolder ()
  {
  }

  public CTOMemberHolder (svm.corba.abstraction.cto.member.CTOMember initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = svm.corba.abstraction.cto.member.CTOMemberHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    svm.corba.abstraction.cto.member.CTOMemberHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return svm.corba.abstraction.cto.member.CTOMemberHelper.type ();
  }

}

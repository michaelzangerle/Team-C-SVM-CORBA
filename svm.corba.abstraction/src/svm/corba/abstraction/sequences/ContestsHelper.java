package svm.corba.abstraction.sequences;


/**
* svm/corba/abstraction/sequences/ContestsHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Export.idl
* Dienstag, 13. November 2012 16:05 Uhr MEZ
*/

abstract public class ContestsHelper
{
  private static String  _id = "IDL:svm/corba/abstraction/sequences/Contests:1.0";

  public static void insert (org.omg.CORBA.Any a, svm.corba.abstraction.sequences.Contests that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static svm.corba.abstraction.sequences.Contests extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = svm.corba.abstraction.cto.contest.CTOContestHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "contests",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (svm.corba.abstraction.sequences.ContestsHelper.id (), "Contests", _members0);
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

  public static svm.corba.abstraction.sequences.Contests read (org.omg.CORBA.portable.InputStream istream)
  {
    svm.corba.abstraction.sequences.Contests value = new svm.corba.abstraction.sequences.Contests ();
    int _len0 = istream.read_long ();
    value.contests = new svm.corba.abstraction.cto.contest.CTOContest[_len0];
    for (int _o1 = 0;_o1 < value.contests.length; ++_o1)
      value.contests[_o1] = svm.corba.abstraction.cto.contest.CTOContestHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, svm.corba.abstraction.sequences.Contests value)
  {
    ostream.write_long (value.contests.length);
    for (int _i0 = 0;_i0 < value.contests.length; ++_i0)
      svm.corba.abstraction.cto.contest.CTOContestHelper.write (ostream, value.contests[_i0]);
  }

}

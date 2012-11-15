package svm.corba.client;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import svm.corba.abstraction.SVMExport;
import svm.corba.abstraction.SVMExportHelper;
import svm.corba.abstraction.cfactory.CorbaControllerFactory;
import svm.corba.abstraction.cfactory.CorbaControllerFactoryHelper;
import svm.corba.abstraction.controller.login.CorbaLoginController;
import svm.corba.abstraction.cto.auth.CTOAuth;
import svm.corba.abstraction.cto.contest.CTOContest;
import svm.corba.abstraction.cto.match.CTOMatch;
import svm.corba.abstraction.sequences.Contests;
import svm.corba.abstraction.sequences.Matches;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 11.11.12
 */
public class Main {
    public static void main(String[] args) {
        try {
            // create and initialize the ORB
            ORB orb = ORB.init(args, null);

            // get the root naming context
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            // Use NamingContextExt instead of NamingContext. This is
            // part of the Interoperable naming Service.
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // resolve the Object Reference in Naming
            String name = "SVMExport";
            SVMExport export = SVMExportHelper.narrow(ncRef.resolve_str(name));

            Calendar cal = Calendar.getInstance();
            cal.set(2012, Calendar.NOVEMBER, 4);
            Contests contests = export.getListOfContestsByDate(cal.getTime().getTime());
            XMLGenerator file = new XMLGenerator();
            String fileName = "Matches.xml";
            Matches matches = export.getListOfMatches(contests.contests[0]);
            XMLGenerator.getXMLFileForMatches(fileName, contests.contests[0],matches.matches);


        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }
}

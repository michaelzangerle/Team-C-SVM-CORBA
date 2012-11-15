package svm.corba.client;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import svm.corba.abstraction.SVMExport;
import svm.corba.abstraction.SVMExportHelper;
import svm.corba.abstraction.cto.contest.CTOContest;
import svm.corba.abstraction.cto.team.CTOTeam;
import svm.corba.abstraction.exceptions.RegisterException;
import svm.corba.abstraction.sequences.Matches;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ProjectTeam: Team C
 * Date: 11.11.12
 */
public class Main {

    private static CTOContest[] contests;
    private static SVMExport export;
    private static CTOTeam[] teams;

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
            export = SVMExportHelper.narrow(ncRef.resolve_str(name));

            while (true) {
                System.out.println("Waehle ein Suchkriterium aus?\n(1: Datum 2: Team)\n");
                int sc = new java.util.Scanner(System.in).nextInt();
                switch (sc) {
                    case 1:
                        searchWithDate();
                        chooseContests();
                        System.out.println("XML generiert!\n");
                        break;
                    case 2:
                        searchWithTeam();
                        chooseContests();
                        System.out.println("XML generiert!");
                        break;
                    default:
                        System.out.println("Unbekanntes Suchkriterium!");
                        continue;
                }

                contests = null;
                teams = null;
            }


        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }

    private static void chooseContests() throws XMLStreamException, FileNotFoundException, RegisterException {

        if (contests.length > 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            System.out.println("Bitte wähle unter folgenden Wettbewerben den gewuenschten aus und gib dessen Zahl ein!\n");
            for (int i = 0; i < contests.length; i++) {
                System.out.println("[" + (i + 1) + "]\t" + contests[i].name() + "\t" + sdf.format(contests[i].startDate()));
            }

            int c = new java.util.Scanner(System.in).nextInt();
            generateXML(c);
        } else {
            System.out.println("Es wurden keine Wettbewerbe gefunden!");
        }


    }

    private static void generateXML(int c) throws svm.corba.abstraction.exceptions.RegisterException, FileNotFoundException, XMLStreamException {
        XMLGenerator file = new XMLGenerator();
        String fileName = "Matches.xml";
        Matches matches = export.getListOfMatches(contests[c - 1]);
        XMLGenerator.getXMLFileForMatches(fileName, contests[c - 1], matches.matches);
    }

    private static void searchWithTeam() throws RegisterException {
        System.out.println("Bitte wähle einen Teamnamen aus folgender Liste und gib dessen Zahl ein!:\n");
        teams = export.getListOfTeams().teams;
        for (int i = 0; i < teams.length; i++) {
            System.out.println("[" + (i + 1) + "]\t" + teams[i].name());
        }

        int val = new java.util.Scanner(System.in).nextInt();

        contests = export.getListOfContestsByTeam(teams[val-1]).contests;

    }

    private static void searchWithDate() throws RegisterException, ParseException {
        System.out.println("Bitte gib ein Datum ein!\n(z.B. 04.11.2012)\n");
        String val = new java.util.Scanner(System.in).nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date date = sdf.parse(val);

        contests = export.getListOfContestsByDate(date.getTime()).contests;
    }
}

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
                int sc = -1;


                try {
                    sc = new java.util.Scanner(System.in).nextInt();
                } catch (Exception e) {
                    System.out.println("Ungültiger Wert!");
                    continue;
                }


                switch (sc) {
                    case 1:
                        searchWithDate();

                        System.out.println("XML generiert!\n");
                        break;
                    case 2:
                        searchWithTeam();

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
        boolean valid = false;
        int val = 0;
        while (valid == false) {
            if (contests.length > 0) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                System.out.println("Bitte wähle unter folgenden Wettbewerben den gewuenschten aus und gib dessen Zahl ein!\n");
                for (int i = 0; i < contests.length; i++) {
                    System.out.println("[" + (i + 1) + "]\t" + contests[i].name() + "\t" + sdf.format(contests[i].startDate()));
                }

                try {
                    val = new java.util.Scanner(System.in).nextInt();
                    if (val >= 1 && val <= contests.length) {
                        valid = true;
                    }
                } catch (Exception e) {
                    System.out.println("Ungültiger Wert!");
                }


            } else {
                System.out.println("Es wurden keine Wettbewerbe gefunden!");
            }

        }
        generateXML(val);
    }

    private static void generateXML(int c) throws svm.corba.abstraction.exceptions.RegisterException, FileNotFoundException, XMLStreamException {

        if (c - 1 >= 0 && c - 1 < contests.length) {
            XMLGenerator file = new XMLGenerator();

            SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-YYYY_hh-mm-ss");
            Date date = new Date();

            String fileName = "Matches"+sdf.format(date)+".xml";
            Matches matches = export.getListOfMatches(contests[c - 1]);
            XMLGenerator.getXMLFileForMatches(fileName, contests[c - 1], matches.matches);
        } else {

        }
    }

    private static void searchWithTeam() throws RegisterException, XMLStreamException, FileNotFoundException {
        boolean valid = false;
        int val = 0;

        while (valid == false) {
            System.out.println("Bitte wähle einen Teamnamen aus folgender Liste und gib dessen Zahl ein!:\n");
            teams = export.getListOfTeams().teams;
            for (int i = 0; i < teams.length; i++) {
                System.out.println("[" + (i + 1) + "]\t" + teams[i].name());
            }
            try {
                val = new java.util.Scanner(System.in).nextInt();
                if (val >= 1 && val <= teams.length) {
                    valid = true;
                }
            } catch (Exception e) {
                System.out.println("Ungültiger Wert!");
            }


        }
        contests = export.getListOfContestsByTeam(teams[val - 1]).contests;
        chooseContests();
    }

    private static void searchWithDate() throws RegisterException, ParseException, XMLStreamException, FileNotFoundException {

        boolean b = false;
        Date date = new Date();

        while (b == false) {
            System.out.println("Bitte gib ein Datum ein!\n(z.B. 04.11.2012)\n");
            String val = new java.util.Scanner(System.in).nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

            try {
                date = sdf.parse(val);
                b = true;
            } catch (ParseException e) {
                System.out.println("Ungültiges Datum!");
            }

        }

        contests = export.getListOfContestsByDate(date.getTime()).contests;
        chooseContests();
    }
}

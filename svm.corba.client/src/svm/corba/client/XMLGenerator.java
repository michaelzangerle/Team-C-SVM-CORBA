package svm.corba.client;


import svm.corba.abstraction.cto.contest.CTOContest;
import svm.corba.abstraction.cto.match.CTOMatch;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;


/**
 * Projectteam: Team C
 * Date: 14.11.12
 */
public class XMLGenerator {

    private static XMLOutputFactory of;
    private static XMLEventWriter ew;
    private static XMLEventFactory ef;

    private static XMLEvent end;
    private static XMLEvent tab;

    public static void getXMLFileForMatches(String fileName, CTOContest contest, CTOMatch[] matches) throws FileNotFoundException, XMLStreamException {

        init(fileName);

        addLineEnd(1);
        createOpenTag("contest");
        addLineEnd(1);

        parseContest(contest, matches);

        createCloseTag("contest");
        ew.close();
        ew.add(ef.createEndDocument());

    }

    private static void parseContest(CTOContest contest, CTOMatch[] matches) throws XMLStreamException {

        ef = XMLEventFactory.newInstance();

        createNode("contestName", contest.name());
        createNode("startDate", new Date(contest.startDate()).toString());
        createNode("endDate", new Date(contest.endDate()).toString());
        createNode("fee", contest.fee() + "");

        addTab(1);
        createOpenTag("contactDetails");
        addLineEnd(1);
        addTab(1);
        createNode("phone1", new Date(contest.endDate()).toString());
        addTab(1);
        createNode("email1", contest.email1());
        addTab(1);
        createNode("fax", contest.fax());
        addTab(1);
        createNode("postalcode", contest.postalCode());
        addTab(1);
        createNode("place", contest.placeName());
        addTab(1);
        createNode("streetNumber", contest.streetNumber());
        addTab(1);
        createNode("street", contest.street());

        addTab(1);
        createCloseTag("contactDetails");
        addLineEnd(1);

        // Create Start node
        addTab(1);
        createOpenTag("matches");
        addLineEnd(1);

        parseMatches(matches);

        // Create End node
        addTab(1);
        createCloseTag("matches");
        addLineEnd(1);

    }

    private static void parseMatches(CTOMatch[] matches) throws XMLStreamException {

        ef = XMLEventFactory.newInstance();

        for (CTOMatch m : matches) {

            if (m.canceled() == true) continue;

            addTab(2);
            createOpenTag("match");
            addLineEnd(1);

            addTab(2);
            createNode("matchName", m.name());

            addTab(2);
            createNode("homeTeam", m.homeTeam());

            addTab(2);
            createNode("awayTeam", m.awayTeam());

            addTab(2);
            createNode("startDate", new Date(m.startDate()).toString());

            addTab(2);
            createNode("endDate", new Date(m.endDate()).toString());

            addTab(2);
            createNode("description", m.description());

            addTab(2);
            createNode("remarks", m.remarks());

            addTab(2);
            createNode("postalCode", m.postalCode());

            addTab(2);
            createNode("place", m.placeName());

            addTab(2);
            createNode("streetNumber", m.streetNumber());

            addTab(2);
            createNode("street", m.street());


            addTab(2);
            createCloseTag("match");
            addLineEnd(1);

        }

    }


    //region init and helper methods

    private static void createNode(String nodeName, String nodeValue) throws XMLStreamException {

        // Create Start node
        StartElement sElement = ef.createStartElement("", "", nodeName);
        addTab(1);
        ew.add(sElement);

        // Create Content
        Characters characters = ef.createCharacters(nodeValue);
        ew.add(characters);

        // Create End node
        EndElement eElement = ef.createEndElement("", "", nodeName);
        ew.add(eElement);
        addLineEnd(1);

    }

    private static void createCloseTag(String tagName) throws XMLStreamException {
        ew.add(ef.createEndElement("", "", "\n" + tagName));
    }

    private static void createOpenTag(String tagName) throws XMLStreamException {
        StartElement configStartElement = ef.createStartElement("", "", tagName);
        ew.add(configStartElement);
    }

    private static void addTab(int x) throws XMLStreamException {

        if (x <= 0) return;

        for (int i = 0; i < x; i++) {
            ew.add(tab);
        }
    }

    private static void addLineEnd(int x) throws XMLStreamException {

        if (x <= 0) return;

        for (int i = 0; i < x; i++) {
            ew.add(end);
        }
    }

    private static void init(String fileName) throws XMLStreamException, FileNotFoundException {

        of = XMLOutputFactory.newInstance();
        ew = of.createXMLEventWriter(new FileOutputStream(fileName));
        ef = XMLEventFactory.newInstance();

        end = ef.createDTD("\n");
        tab = ef.createDTD("\t");

        StartDocument startDocument = ef.createStartDocument();
        ew.add(startDocument);
    }

    //endregion
}

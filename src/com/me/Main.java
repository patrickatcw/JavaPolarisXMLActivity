package com.me;
//open the xml file
//read it into an object
//write to file
//https://www.geeksforgeeks.org/serialization-in-java/
/*Serialization is a mechanism of converting the state
        of an object into a byte stream.
        Deserialization is the reverse process where
        the byte stream is used to recreate the actual
        Java object in memory. This mechanism is used
        to persist the object.*/
//https://www.journaldev.com/898/read-xml-file-java-dom-parser

//https://www.youtube.com/watch?v=HfGWVy-eMRc

import org.xml.sax.SAXException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class Main {

    private static String _XMLFile = "C:\\java\\JavaPolarisXML\\src\\com\\patrick\\resources\\clevelandMarathon.xml";

    public static void main(String[] args) {

        Deserialize();
        Serialize();

    }

    private static void Deserialize() {
        //open file
        //place the file into the object
        File file = new File(_XMLFile);
        DocumentBuilderFactory doc = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder build = doc.newDocumentBuilder();
            Document document = new Document() {
            };
            document.getDocumentElement().normalize();

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e){
            e.printStackTrace();
        } catch ()

    }

    private static void Serialize() {
        //open file
        //write the object into the file

    }


}



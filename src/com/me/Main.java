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

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        DocumentBuilderFactory  factory= DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("C:\\java\\JavaPolarisXMLActivity\\src\\resources\\clevelandMarathon.xml");
            NodeList runnerList = doc.getElementsByTagName("runners");
            for(int i = 0; i < runnerList.getLength();i ++ ){
                Node r = runnerList.item(i);
                if(r.getNodeType() == Node.ELEMENT_NODE){
                    Element runners = (Element) r;
                      String Name = runners.getAttribute("Name");
                      NodeList nameList = runners.getChildNodes();
                      for(int j = 0; j < nameList.getLength(); j++){
                          Node n = nameList.item(j);
                          if(n.getNodeType() == Node.ELEMENT_NODE){
                              Element name = (Element) n;
                              System.out.println("Runner " + runners + ":" + name.getTagName()
                              + " = " + runners.getTextContent());
                          }
                      }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
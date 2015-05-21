/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sax.xml;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Formação
 */
public class SaxXml extends DefaultHandler {

        List<Book> bookL;
        String bookXmlFileName;
        String tmpValue;
        Book bookTmp;
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd");
        
        public SaxXml(String bookXmlFilename) {
            this.bookXmlFileName = bookXmlFilename;
            bookL = new ArrayList<>();
            parseDocumentSAX();
            printDataSax();
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private void parseDocumentSAX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void printDataSax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

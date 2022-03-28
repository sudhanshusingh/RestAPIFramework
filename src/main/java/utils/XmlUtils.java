package utils;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlUtils {

    public void createNewXml(Class xmlclass) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(xmlclass);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(xmlclass, new File("./book.xml"));
    }

    /**
     * Read Xml from it's root element
     * @param rootPath
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public void readDataFromXml(String rootPath) throws ParserConfigurationException, IOException, SAXException {
        File fXmlFile = new File(rootPath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
    }
}

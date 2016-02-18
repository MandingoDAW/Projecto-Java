package projectom03uf5;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Clase que crea un xml referent a les notes mitjançant JAXP i DOM
 * @author Sergi Vicente, Oriol Mejías i Eric Pérez.
 * @version 1.0 04/02/2016
 */

public class creacioXML  {

    public creacioXML(ArrayList _key, ArrayList _nameKey) {

        int sized=_nameKey.size();
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document xml = docBuilder.newDocument();
            
            Element elementArrel = xml.createElement("song");
            xml.appendChild(elementArrel);
                
                 
                for(int i=0;i<_key.size();i++){
                    Element nota = xml.createElement("nota");
                    elementArrel.appendChild(nota);
                    int idn=i+1; 
                    String sIdn = String.valueOf(idn); 
                    nota.setAttribute("id", sIdn);
                    Element name = xml.createElement("name");
                    nota.appendChild(name);
                    
                    System.out.println(_nameKey.get(i));
                    name.appendChild(xml.createTextNode((String) _nameKey.get(i)));
                    Element key = xml.createElement("key");
                    nota.appendChild(key);
                    String keyString=_key.get(i).toString();
                    
                    key.appendChild(xml.createTextNode(keyString));
                    
                }
                
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource origen = new DOMSource(xml);
            StreamResult sortidaXML = new StreamResult(new File("song.xml"));
            
            
            transformer.transform(origen, sortidaXML);
            System.out.println("XML creat!!");
                
        } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	  } catch (TransformerException tfe) {
		tfe.printStackTrace();
	  }
        
    }
}
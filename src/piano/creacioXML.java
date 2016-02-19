package piano;

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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Clase que crea un xml referent a les notes mitjançant JAXP i DOM
 * @author Sergi Vicente, Oriol Mejías i Eric Pérez.
 * @version 1.0 04/02/2016
 */
public class creacioXML{
    private String pathname;
    private ArrayList key;
    private ArrayList nameKey;
    
    public creacioXML(String _pathName,ArrayList _key, ArrayList _nameKey){
        this.key=_key;
        this.nameKey=_nameKey;
        this.pathname=_pathName;
        creacio(_key,_nameKey);
        cargarXml(_pathName); 
    }

    public void creacio(ArrayList _key, ArrayList _nameKey) {

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
    
    public void cargarXml(String _pathName) {
        try {
            File song = new File(_pathName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(song);
            doc.getDocumentElement().normalize();

            System.out.println("arrel " + doc.getDocumentElement().getNodeName());
            NodeList nodes = doc.getElementsByTagName("nota");
            System.out.println("==========================");

            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("nota lletra: " + obtenirContingut("name", element));
                    System.out.println("nota numero: " + obtenirContingut("key", element));
                   
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static String obtenirContingut(String etiqueta, Element element) {
        NodeList nodes = element.getElementsByTagName(etiqueta).item(0).getChildNodes();
        Node node = (Node) nodes.item(0);
        return node.getNodeValue();
    }
}

package piano;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 *
 * @author usuario
 */
public class Piano extends Instrument{
  
  private String keyName;
  private String pathMidi = "";
  public static Nota Do;

    public Piano(String _pathName) {
        this.pathMidi=_pathName;
        //cargarXml(_pathName);    
    }
  
   
    
   
}




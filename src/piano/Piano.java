
package piano;

import java.io.File;
import java.util.HashMap;
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
  /*
  public HashMap<String, Nota> map;

    public HashMap<String, Nota> getMap() {
        return map;
    }

    public Piano() {
        
        Nota Do = new Nota("Do", 0, 72, 400);//C
        Nota DoS = new Nota("Do#", 0, 73, 400);//C#
        Nota re = new Nota("Re", 0, 74, 400);//D
        Nota reS = new Nota("Re#", 0, 75, 400);//D#
        Nota mi = new Nota("Mi", 0, 76, 400);//E
        Nota fa = new Nota("Fa", 0, 77, 400);//F
        Nota faS = new Nota("Fa#", 0, 78, 400);//F#
        Nota sol = new Nota("Sol", 0, 79, 400);//G
        Nota solS = new Nota("Sol#", 0, 80, 400);//G#
        Nota la = new Nota("La", 0, 81, 400);//A
        Nota laS = new Nota("La#", 0, 82, 400);//A#
        Nota si = new Nota("Si", 0, 83, 400);
        // initialize of hashmap
        map = new HashMap<String, Nota>();

        // assign each student id as key and the student objects as values on
        // our hashmap
        map.put(Do.getNom(), Do);
        map.put(DoS.getNom(), DoS);
        map.put(re.getNom(), re);
        map.put(reS.getNom(), reS);
        map.put(mi.getNom(), mi);
        map.put(fa.getNom(), fa);
        map.put(faS.getNom(), faS);
        map.put(sol.getNom(), sol);
        map.put(solS.getNom(), solS);
        map.put(la.getNom(), la);
        map.put(laS.getNom(), laS);
        map.put(si.getNom(), si);
        //cargarXml(_pathName);    
    }
  
    */
   
    
   
}




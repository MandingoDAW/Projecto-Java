package piano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.sound.midi.MidiUnavailableException;
import static jdk.nashorn.internal.objects.NativeArray.map;
//import static piano.Piano.Do;


/**
 *
 * @author Eric, Oriol, Sergi
 */
public class FXMLDocumentController<T> implements Initializable {
    
   
    @FXML
    private Button tecla1;
    
    @FXML
    private Button tecla2;
    
    @FXML
    private Button tecla3;
    
    @FXML
    private Button tecla4;
    
    @FXML
    private Button tecla5;
    
    @FXML
    private Button tecla6;
    
    @FXML
    private Button tecla7;
    
    @FXML
    private Button tecla8;
    
    @FXML
    private Button tecla9;
    
    @FXML
    private Button tecla10;
    
    @FXML
    private Button tecla11;
    
    @FXML
    private Button tecla12;
    
    @FXML
    private Button tecla13;
    

//Do.getNom();
    private HashMap<T, Nota> map;
    
        Nota<Integer> Do = new Nota<>(1 , 0, 72, 400);
        Nota<String> DoS = new Nota<>("Do#", 0, 73, 400);
        Nota<Integer> re = new Nota<>(2, 0, 74, 400);
        Nota<String> ReS = new Nota<>("Re#", 0, 75, 400);
        Nota<Integer> mi = new Nota<>(3, 0, 76, 400);
        Nota<Integer> fa = new Nota<>(4, 0, 77, 400);
        Nota<String> faS = new Nota<>("Fa#", 0, 78, 400);
        Nota<Integer> sol = new Nota<>(5, 0, 79, 400);
        Nota<String> solS = new Nota<>("Sol#", 0, 80, 400);
        Nota<Integer> la = new Nota<>(6, 0, 81, 400);//C#
        Nota<String> laS = new Nota<>("La#", 0, 82, 400);//D
        Nota<Integer> si = new Nota<>(7, 0, 83, 400);//C#
        Nota<String> Master = new Nota<>("Master", 0, 0, 400);
        // initialize of hashmap
        //map = new HashMap<String, Nota>();
        // assign each student id as key and the student objects as values on
        // our hashmap
        
    
    //map=piano.getMap();
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        map = new HashMap<>();
        
        map.put((T) "Do", Do);
        map.put((T) DoS.getNom(), DoS);
        map.put((T) re.getNom(), re);
        map.put((T) ReS.getNom(), ReS);
        map.put((T) mi.getNom(), mi);
        map.put((T) fa.getNom(), fa);
        map.put((T) faS.getNom(), faS);
        map.put((T) sol.getNom(), sol);
        map.put((T) solS.getNom(), solS);
        map.put((T) la.getNom(), la);
        map.put((T) laS.getNom(), laS);
        map.put((T) si.getNom(), si);
        
        
        tecla1.setOnAction(new EventHandler<ActionEvent>() {
            
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                //map.get("Do");
                Do.tocar();
               
                
                
                
            }
        });
        
         tecla2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Re!");
                re.tocar();
                
            }
        });
         
         
          tecla3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Mi!");
                mi.tocar();
                
            }
        });
        
            tecla4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Fa!");
                fa.tocar();
                
            }
        });
             tecla5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Sol!");
                sol.tocar();
                
            }
        });
              tecla6.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("La!");
                la.tocar();
                
            }
        });
               tecla7.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Si!");
                si.tocar();
                
            }
        });
                tecla8.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Re#!");
                ReS.tocar();
                
            }
        });
                 tecla9.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Fa#!");
                faS.tocar();
                
            }
        });
                  tecla10.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Sol#!");
                solS.tocar();
                
            }
        });
                   tecla11.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("La#!");
                laS.tocar();
                
            }
        });
                   tecla12.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do#!");
                DoS.setNom("DoSostenido");
                DoS.tocar();
                
            }
        });
                   tecla13.setOnAction(new EventHandler<ActionEvent>() {
                     
                       
            @Override
            public void handle(ActionEvent event) {
                //Test test = new Test("test.mid");
                //creacioXML xml = new creacioXML("test.mid",test.getKeySong(),test.getKeyChar());
                //xml.creacio(_key, _nameKey);
                //xml.cargarXml(_pathName);
                System.out.println("XML");
                try {
                    try {
                        Master.grabacio();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ExcepcioPropia ex) {
                        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (MidiUnavailableException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      
    
}


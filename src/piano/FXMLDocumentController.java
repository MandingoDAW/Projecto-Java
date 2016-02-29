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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import static jdk.nashorn.internal.objects.NativeArray.map;
//import static piano.Piano.Do;


/**
 *
 * @author Eric
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
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
    /*private HashMap<String, Nota> map;
    
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
        //map = new HashMap<String, Nota>();
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
        map.put(si.getNom(), si);*/
    
    //map=piano.getMap();
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
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
                reS.tocar();
                
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
                DoS.tocar();
                
            }
        });
                   tecla13.setOnAction(new EventHandler<ActionEvent>() {
                     
                       
            @Override
            public void handle(ActionEvent event) {
                //Test test = new Test("test.mid");
                //creacioXML xml = new creacioXML("test.mid",test.getKeySong(),test.getKeyChar());
                System.out.println("XML");
                
                
                
            }
        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      
    
}


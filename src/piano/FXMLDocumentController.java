package piano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        Nota Do = new Nota();
        Nota DoSostenido = new Nota();
        Nota Re = new Nota();
        Nota ReSostenido = new Nota();
        Nota Mi = new Nota();
        Nota Fa = new Nota();
        Nota FaSostenido = new Nota();
        Nota Sol = new Nota();
        Nota SolSostenido = new Nota();
        Nota La = new Nota();
        Nota LaSostenido = new Nota();
        Nota Si = new Nota();
        Test test = new Test("test.mid");
        creacioXML xml = new creacioXML(test.getKeySong(),test.getKeyChar());
        Piano piano = new Piano("song.xml");
        
        
        tecla1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                Do.tocarDo();
                
            }
        });
        
         tecla2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                DoSostenido.tocarDoSostenido();
                
            }
        });
         
         
          tecla3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                Re.tocarRe();
                
            }
        });
        
            tecla4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                ReSostenido.tocarReSostenido();
                
            }
        });
             tecla5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                Mi.tocarMi();
                
            }
        });
              tecla6.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                Fa.tocarFa();
                
            }
        });
               tecla7.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                FaSostenido.tocarFaSostenido();
                
            }
        });
                tecla8.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                Sol.tocarSol();
                
            }
        });
                 tecla9.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                SolSostenido.tocarSolSostenido();
                
            }
        });
                  tecla10.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                La.tocarLa();
                
            }
        });
                   tecla11.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                LaSostenido.tocarLaSostenido();
                
            }
        });
                   tecla12.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                Si.tocarSi();
                
            }
        });
                   tecla13.setOnAction(new EventHandler<ActionEvent>() {
                     
                       
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                
                
                
            }
        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      
    
}

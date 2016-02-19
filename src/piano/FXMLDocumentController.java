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
        
      
        
        
        tecla1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do!");
                //Do.tocar();
                
            }
        });
        
         tecla2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Re!");
                //DoS.tocar();
                
            }
        });
         
         
          tecla3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Mi!");
                //re.tocar();
                
            }
        });
        
            tecla4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Fa!");
                //reS.tocar();
                
            }
        });
             tecla5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Sol!");
                //mi.tocarMi();
                
            }
        });
              tecla6.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("La!");
                //fa.tocar();
                
            }
        });
               tecla7.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Si!");
                //faS.tocar();
                
            }
        });
                tecla8.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Re#!");
                //sol.tocar();
                
            }
        });
                 tecla9.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Fa#!");
                //solS.tocar();
                
            }
        });
                  tecla10.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Sol#!");
                //la.tocar();
                
            }
        });
                   tecla11.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("La#!");
                //laS.tocarLaSostenido();
                
            }
        });
                   tecla12.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Do#!");
                //si.tocar();
                
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

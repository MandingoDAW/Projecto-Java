/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piano;

import java.util.HashMap;
import javafx.application.Application;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Eric
 */
public class PianoMain extends Application {
    
    public HashMap<String, Nota> map;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        launch(args);
        Piano piano=new Piano();
        Test test = new Test("test.mid");
        creacioXML xml = new creacioXML("test.mid",test.getKeySong(),test.getKeyChar());
        /*Nota Do = new Nota("Do", 0, 72, 400);//C
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
        Nota si = new Nota("Si", 0, 83, 400);*/
        
        /*HashMap<String, Nota> map = new HashMap<String, Nota>();
		map = init();
		// iterate to all the keys stored on our hashmap
		for (String s : map.keySet()) {
	
		}*/
	
    }
   
}
    


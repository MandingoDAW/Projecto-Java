/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piano;

/**
 * Classe Externa que mostra la salutació de la app al carregarse amb la seva classe Interna
 * @author Eric, Oriol, Sergi
 */
public class Bienvenida {
private String Saludar = "Benvingut a la aplicació de la API de Java MIDI";

/**
 * Classe Interna amb un metode Saludo per saludar quan s'inici la aplicació
 * @author Eric, Oriol, Sergi
 */
        class Saludar{
            public void Saludo(){
                System.out.println(Saludar);
                }
        }

        
/**
 * Metòde de la classe Externa per instanciar la classe Interna
 * @author Eric, Oriol, Sergi
 */
public void Saludar(){
        //Crear una instancia de la classe interna
        Saludar saludo = new Saludar();
        saludo.Saludo();
}

}
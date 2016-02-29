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

//Definició de una classe interna
        class Saludar{
            public void Saludo(){
                System.out.println(Saludar);
                }
        }

public void Saludar(){
        //Crear una instancia de la classe interna
        Saludar saludo = new Saludar();
        saludo.Saludo();
}

}
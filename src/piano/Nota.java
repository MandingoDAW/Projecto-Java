package piano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Stack;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Eric
 */
public class Nota extends Piano {
    
    String nom;
    int channel = 0; // 0 is a piano, 9 is percussion, other channels are for other instruments
    int volume = 400; // between 0 et 127
    int pitch;
    static Stack pila = new Stack();//array para poner las notas que vas tocando
    private String a[] = {};

   public Nota(String nom, int channel,int pitch, int volume) {
        this.nom=nom;
        this.channel=channel;
        this.volume=volume;
        this.pitch=pitch;
        System.out.println(this.pitch);
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }
    
    public void tocar(){
       
            try {       System.out.println("Esta sonant");
			Synthesizer synth = MidiSystem.getSynthesizer();
			synth.open();
			MidiChannel[] channels = synth.getChannels();
                        
                        channels[this.channel].noteOn( this.pitch , this.volume ); // C note
                         pila.push(this.pitch);
                         System.out.println(pila);
                         
                        
                        
            }catch (Exception e) {
			e.printStackTrace();
		}

     
    }  
    
   // public void grabacio(String _pathName,) {
    
    //}

    public static Stack getPila() {
        return pila;
    }

    
}

package piano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Stack;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Eric
 * @param <T>
 */
public class Nota<T> extends Piano {
    
    public T nom;
    public int channel = 0; // 0 is a piano, 9 is percussion, other channels are for other instruments
    int volume = 400; // between 0 et 127
    int pitch;
    static Stack pila = new Stack();//array para poner las notas que vas tocando
    private String a[] = {};
    private int duration = 200;

   public Nota(T nom, int channel,int pitch, int volume) {
        this.channel=channel;
        this.volume=volume;
        this.pitch=pitch;
        System.out.println(this.pitch);
        
    }

    public T getNom() {
        return nom;
    }

    public void setNom(T nom) {
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
    
    @Override
    public void tocar(){
       
            try {     
                        System.out.println("Esta sonant");
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
    
   public void grabacio() throws MidiUnavailableException, InterruptedException,ExcepcioPropia {//llençem l'excepció propia
      int sized=pila.size();
      
    for(int i=0;i<sized;i++){
        //System.out.println(sized);
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        int s=(Integer)pila.get(i);
        if(s==0){
           throw new ExcepcioPropia("La nota no sonara per que es 0"); 
        }
        
       channels[this.channel].noteOn( s , this.volume );
       Thread.sleep( duration );
 
    }
       
    
   }

    public static Stack getPila() {
        return pila;
    }

    
}
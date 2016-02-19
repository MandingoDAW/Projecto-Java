package piano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Eric
 */
public class Nota {
    
    String nom;
    int channel = 0; // 0 is a piano, 9 is percussion, other channels are for other instruments
    int volume = 400; // between 0 et 127
    int pitch;

   public Nota(String nom, int channel, int volume, int pitch) {
        this.nom=nom;
        this.channel=channel;
        this.volume=volume;
        this.pitch=pitch;
        
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
       
            try {
			Synthesizer synth = MidiSystem.getSynthesizer();
			synth.open();
			MidiChannel[] channels = synth.getChannels();
                        
                        channels[0].noteOn( this.pitch, this.volume ); // C note
       
            }catch (Exception e) {
			e.printStackTrace();
		}

     
    }  
}

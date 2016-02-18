
package projectom03uf5;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
   


public class Test {
    public static final int NOTE_ON = 0x90;
    public static final int NOTE_OFF = 0x80;
    public static final String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    private String pathMidi = "";
    //private String[] keySong={};//nota numerica
    //private String[] keyChar={};
    private ArrayList keySong = new ArrayList();
    private ArrayList keyChar = new ArrayList();
    Test(String _pathMidi) {    
        this.pathMidi=_pathMidi;
            try {    
                testear(_pathMidi);

            } catch (Exception ex) {
                System.out.println("No s'ha pogut testejar");
            }
    }

    public void testear(String _pathMidi) throws Exception {
        Sequence sequence = MidiSystem.getSequence(new File(_pathMidi));
        //sequence = pathMidi;
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        int trackNumber = 0;
        for (Track track :  sequence.getTracks()) {
            trackNumber++;
            System.out.println(this.keySong.size()+"Track " + trackNumber + ": size = " + track.size());
            System.out.println();
            for (int i=0; i < track.size(); i++) { 
                MidiEvent event = track.get(i);
                System.out.print("@" + event.getTick() + " ");
                MidiMessage message = event.getMessage();
                if (message instanceof ShortMessage) {
                    ShortMessage sm = (ShortMessage) message;
                    System.out.print("Channel: " + sm.getChannel() + " ");
                    if (sm.getCommand() == NOTE_ON) {
                        int key = sm.getData1();
                        int octave = (key / 12)-1;
                        this.keySong.add(key);
                        //this.keyChar[i]=key;
                        int note = key % 12;
                        String noteName = NOTE_NAMES[note];
                        this.keyChar.add(noteName);
                        int velocity = sm.getData2();
                        System.out.println(i+" "+this.keySong.size() +" Note on, " + noteName + octave + " key=" + key + " velocity: " + velocity);
                    } else if (sm.getCommand() == NOTE_OFF) {
                        int key = sm.getData1();
                        int octave = (key / 12)-1;
                        int note = key % 12;
                        String noteName = NOTE_NAMES[note];
                        int velocity = sm.getData2();
                        System.out.println(" Note off, " + noteName + octave + " key=" + key + " velocity: " + velocity);
                    } else {
                        System.out.println("Command:" + sm.getCommand());
                    }
                } else {
                    System.out.println(this.keySong.size()+" Other message: " + message.getClass());
                }
            }

            System.out.println();
        }   
    }

    public ArrayList getKeySong() {
        return keySong;
    }

    public void setKeySong(ArrayList keySong) {
        this.keySong = keySong;
    }

    public ArrayList getKeyChar() {
        return keyChar;
    }

    public void setKeyChar(ArrayList keyChar) {
        this.keyChar = keyChar;
    }
    
    
}
        
        
    
    


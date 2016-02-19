/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piano;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiChannel;

public class music {

	public static void main( String[] args ) {

		int channel = 0; // 0 is a piano, 9 is percussion, other channels are for other instruments

		int volume = 400; // between 0 et 127
		int duration = 200; // in milliseconds

		try {
			Synthesizer synth = MidiSystem.getSynthesizer();
			synth.open();
			MidiChannel[] channels = synth.getChannels();

			// --------------------------------------
			// Play a few notes.
			// The two arguments to the noteOn() method are:
			// "MIDI note number" (pitch of the note),
			// and "velocity" (i.e., volume, or intensity).
			// Each of these arguments is between 0 and 127.
			channels[channel].noteOn( 72, volume ); // C note
			Thread.sleep( duration );
			channels[channel].noteOff( 72 );
                        channels[channel].noteOn( 61, volume ); // C# note
			Thread.sleep( duration );
			channels[channel].noteOff( 61 );
			channels[channel].noteOn( 62, volume ); // D note
			Thread.sleep( duration );
			channels[channel].noteOff( 62 );
                        channels[channel].noteOn( 63, volume ); // D# note
			Thread.sleep( duration );
			channels[channel].noteOff( 63 );
			channels[channel].noteOn( 76, volume ); // E note
			Thread.sleep( duration );
			channels[channel].noteOff( 76 );
                        channels[channel].noteOn( 65, volume ); // F note
			Thread.sleep( duration );
			channels[channel].noteOff( 65 );
                        channels[channel].noteOn( 66, volume ); // F# note
			Thread.sleep( duration );
			channels[channel].noteOff( 66 );
                        channels[channel].noteOn( 67, volume ); // G note
			Thread.sleep( duration );
			channels[channel].noteOff( 67 );
                        channels[channel].noteOn( 56, volume ); // G# note
			Thread.sleep( duration );
			channels[channel].noteOff( 56 );
                        channels[channel].noteOn( 69, volume ); // A note
			Thread.sleep( duration );
			channels[channel].noteOff( 69 );
                         channels[channel].noteOn( 70, volume ); // A# note
			Thread.sleep( duration );
			channels[channel].noteOff( 70 );
                        channels[channel].noteOn( 71, volume ); // B note
			Thread.sleep( duration );
			channels[channel].noteOff( 71 );

			Thread.sleep( 500 );

			// --------------------------------------
			// Play a C major chord.
			channels[channel].noteOn( 60, volume ); // C
			channels[channel].noteOn( 64, volume ); // E
			channels[channel].noteOn( 67, volume ); // G
			Thread.sleep( 3000 );
			channels[channel].allNotesOff();
			Thread.sleep( 500 );



			synth.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
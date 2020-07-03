package head.first.java.chapter11;

import javax.sound.midi.*;

public class MusicTest implements ControllerEventListener {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            int[] eventsIWant = { 127 };
            sequencer.addControllerEventListener(this, eventsIWant);
            Sequence sequence = new Sequence(Sequence.PPQ, 4);

            Track track = sequence.createTrack();
            for (int i = 5; i < 61; i+=4) {
                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, i, 100, i + 2));
            }

            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("musci over!");
        }
    }
    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e0) {

        }
        return  event;
    }

    @Override
    public void controlChange(ShortMessage shortMessage) {
        System.out.println("la");
    }
}

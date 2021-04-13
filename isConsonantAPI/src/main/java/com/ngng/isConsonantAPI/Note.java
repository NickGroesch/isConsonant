package com.ngng.isConsonantAPI;

import java.util.Hashtable;

public class Note {
    // internal properties
    private final Integer midi;
    private final String scientific;

    // static resources
    public static Hashtable<Integer, String> midiPitchMap;
    static {
        midiPitchMap = new Hashtable<Integer, String>();
        midiPitchMap.put(0, "C");
        midiPitchMap.put(1, "C#");
        midiPitchMap.put(2, "D");
        midiPitchMap.put(3, "Eb");
        midiPitchMap.put(4, "E");
        midiPitchMap.put(5, "F");
        midiPitchMap.put(6, "F#");
        midiPitchMap.put(7, "G");
        midiPitchMap.put(8, "Ab");
        midiPitchMap.put(9, "A");
        midiPitchMap.put(10, "Bb");
        midiPitchMap.put(11, "B");
    }

    static String midiToScientific(Integer midi) {
        Integer octave = midi / 12;
        Integer midiMod = midi % 12;
        String letter = Note.midiPitchMap.get(midiMod);
        // System.out.println(letter.concat(octave.toString()));
        return letter.concat(octave.toString());
    }

    // constructors
    public Note(Integer midi) {
        this.midi = midi;
        this.scientific = Note.midiToScientific(midi);
    }

    // getters
    public Integer getPitch() {
        return this.midi;
    }

    public String getScientific() {
        return this.scientific;
    }

    // instance methods
    public Note transpose(int midiDiff) {
        return new Note(this.midi + midiDiff);
    }
}

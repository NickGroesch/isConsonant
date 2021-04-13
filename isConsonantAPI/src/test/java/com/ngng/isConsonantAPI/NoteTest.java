package com.ngng.isConsonantAPI;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NoteTest {
    double delta = 0.1d;

    @Test
    public void takesTheMidiYouGive() {
        Note middleC = new Note(60);
        assertEquals(middleC.getPitch().doubleValue(), 60, delta);
    }

    @Test
    public void translatesMidiIntoScientific() {
        Note middleC = new Note(60);
        assertEquals(middleC.getScientific(), "C5");
    }

    @Test
    public void translatesMidiIntoScientific2() {
        Note middleCs = new Note(61);
        assertEquals(middleCs.getScientific(), "C#5");
    }

    @Test
    public void staticMidiPitchMapShouldWork() {
        assertEquals(Note.midiPitchMap.get(9), "A");
    }

    @Test
    public void transposeReturnsProperNote() {
        Note middleC = new Note(60);
        assertEquals(middleC.transpose(4).getPitch().doubleValue(), 64, delta);
    }

}

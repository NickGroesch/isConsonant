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
        Note middleC = new Note(61);
        assertEquals(middleC.getScientific(), "C#5");
    }

}

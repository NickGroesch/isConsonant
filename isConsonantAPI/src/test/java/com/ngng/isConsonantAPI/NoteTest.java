package com.ngng.isConsonantAPI;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NoteTest {
    double delta = 0.000001d;

    @Test
    public void takesTheMidiYouGive() {
        Note middleC = new Note(60);
        assertEquals(middleC.getPitch().doubleValue(), 60, delta);
    }
}

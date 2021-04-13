package com.ngng.isConsonantAPI;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntervalTest {
    double delta = 0.1d;

    @Test
    public void calculatesUndirectedDifferenceBetweenNotes() {
        Note middleC = new Note(60);
        Note trebleC = new Note(72);
        Interval beingTested = new Interval(middleC, trebleC);
        assertEquals(beingTested.getUndirected().doubleValue(), 12, delta);
    }

    @Test
    public void calculatesVectorDifferenceBetweenNotes() {
        Note middleC = new Note(60);
        Note trebleC = new Note(48);
        Interval beingTested = new Interval(middleC, trebleC);
        assertEquals(beingTested.getVector().doubleValue(), -12, delta);
    }

    @Test
    public void identifiesWhichNoteIsOnTop() {
        Note middleC = new Note(60);
        Note trebleC = new Note(48);
        Interval beingTested = new Interval(middleC, trebleC);
        assertEquals(beingTested.getUpperNote().getPitch().doubleValue(), 60, delta);
        assertEquals(beingTested.getLowerNote().getPitch().doubleValue(), 48, delta);
    }

    @Test
    public void identifiesNonUnisons() {
        Note middleC = new Note(60);
        Note trebleC = new Note(48);
        Interval beingTested = new Interval(middleC, trebleC);
        assertEquals(beingTested.isUnison, false);
    }

    @Test
    public void identifiesUnisons() {
        Note middleC = new Note(60);
        Note anotherC = new Note(60);
        Interval beingTested = new Interval(middleC, anotherC);
        assertEquals(beingTested.isUnison, true);
    }
}

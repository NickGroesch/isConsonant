package com.ngng.isConsonantAPI;

public class Interval {
    private final Note upperNote;
    private final Note lowerNote;
    private final Integer undirected;
    private final Integer vector;
    public final Boolean isUnison;

    public Interval(Note first, Note second) {
        if (first.getPitch() >= second.getPitch()) {
            this.upperNote = first;
            this.lowerNote = second;
        } else {
            this.upperNote = second;
            this.lowerNote = first;
        }
        if (this.upperNote.getPitch() == this.lowerNote.getPitch()) {
            this.isUnison = true;
        } else {
            this.isUnison = false;
        }
        this.undirected = Math.abs(first.getPitch() - second.getPitch());
        this.vector = second.getPitch() - first.getPitch();
    }

    public Integer getUndirected() {
        return this.undirected;
    }

    public Integer getVector() {
        return this.vector;
    }

    public Note getUpperNote() {
        return this.upperNote;
    }

    public Note getLowerNote() {
        return this.lowerNote;
    }
}

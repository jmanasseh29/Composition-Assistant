package edu.brown.cs.student.project1.keys;

/**
 * Class outlining notes and chords for E class
 *
 */
public class E extends Key {

    /**
     * Constructor that calls note constructor and sets maps
     */
    public E() {
        String[] notes = {"E", "F", "Gb", "G", "Ab", "A", "Bb", "B", "C", "Db", "D", "Eb"};
        String[] chords = {"Emaj7", "F#min7", "G#min7", "Amaj7", "B7", "C#min7", "D#min7b5"};
        this.setMap(notes, "note");
        this.setMap(chords, "chord");
    }

}

package edu.brown.cs.student.project1.keys;

/**
 * Class outlining notes and chords for B class
 *
 */
public class B extends Key {

    /**
     * Constructor that calls note constructor and sets maps
     */
    public B() {
        String[] notes = {"B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb"};
        String[] chords = {"Bmaj7", "C#min7", "D#min7", "Emaj7", "F#7", "G#min7", "A#min7b5"};
        this.setMap(notes, "note");
        this.setMap(chords, "chord");
    }

}

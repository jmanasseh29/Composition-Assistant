package edu.brown.cs.student.project1.keys;

/**
 * Class outlining notes and chords for A class
 *
 */
public class A extends Key {

    /**
     * Constructor that calls note constructor and sets maps
     */
    public A() {
        String[] notes = {"A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab"};
        String[] chords = {"Amaj7", "Bmin7", "C#min7", "Dmaj7", "E7", "F#min7", "G#min7b5"};
        this.setMap(notes, "note");
        this.setMap(chords, "chord");
    }

}

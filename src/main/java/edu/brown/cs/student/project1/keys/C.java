package edu.brown.cs.student.project1.keys;

/**
 * Class outlining notes and chords for C class
 *
 */
public class C extends Key {

    /**
     * Constructor that calls note constructor and sets maps
     */
    public C() {
        String[] notes = {"C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B"};
        String[] chords = {"Cmaj7", "Dmin7", "Emin7", "Fmaj7", "G7", "Amin7", "Bmin7b5"};
        this.setMap(notes, "note");
        this.setMap(chords, "chord");
    }
}

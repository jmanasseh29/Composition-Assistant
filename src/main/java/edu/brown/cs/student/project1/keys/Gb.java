package edu.brown.cs.student.project1.keys;

/**
 * Class outlining notes and chords for Gb class
 *
 */
public class Gb extends Key {

    /**
     * Constructor that calls note constructor and sets maps
     */
    public Gb() {
        String[] notes = {"Gb", "G", "Ab", "A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F"};
        String[] chords = {"Gbmaj7", "Abmin7", "Bbmin7", "Cmaj7", "Db7", "Ebmin7", "Fmin7b5"};
        this.setMap(notes, "note");
        this.setMap(chords, "chord");
    }

}

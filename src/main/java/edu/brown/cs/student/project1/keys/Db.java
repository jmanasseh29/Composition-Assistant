package edu.brown.cs.student.project1.keys;

/**
 * Class outlining notes and chords for Db class
 *
 */
public class Db extends Key {

    /**
     * Constructor that calls note constructor and sets maps
     */
    public Db() {
        String[] notes = {"Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B", "C"};
        String[] chords = {"Dbmaj7", "Ebmin7", "Fmin7", "Gbmaj7", "Ab7", "Bbmin7", "Cmin7b5"};
        this.setMap(notes, "note");
        this.setMap(chords, "chord");
    }

}

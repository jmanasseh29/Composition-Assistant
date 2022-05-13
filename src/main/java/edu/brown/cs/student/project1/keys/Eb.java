package edu.brown.cs.student.project1.keys;

/**
 * Class outlining notes and chords for Eb class
 *
 */
public class Eb extends Key{

    /**
     * Constructor that calls note constructor and sets maps
     */
    public Eb() {
        String[] notes = {"Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B", "C", "Db", "D"};
        String[] chords = {"Ebmaj7", "Fmin7", "Gmin7", "Abmaj7", "Bb7", "Cmin7", "Dmin7b5"};
        this.setMap(notes, "note");
        this.setMap(chords, "chord");
    }
}

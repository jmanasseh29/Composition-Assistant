package edu.brown.cs.student.project1.keys;

/**
 * Class outlining notes and chords for Bb class
 *
 */
public class Bb extends Key {

    /**
     * Constructor that calls note constructor and sets maps
     */
    public Bb() {
        String[] notes = {"Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A"};
        String[] chords = {"Bbmaj7", "Cmin7", "Dmin7", "Ebmaj7", "F7", "Gmin7", "Amin7b5"};
        this.setMap(notes, "note");
        this.setMap(chords, "chord");
    }

}

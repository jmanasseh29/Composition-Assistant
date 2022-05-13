package edu.brown.cs.student.project1.keys;

/**
 * Class outlining notes and chords for D class
 *
 */
public class D extends Key {

    /**
     * Constructor that calls note constructor and sets maps
     */
    public D() {
        String[] notes = {"D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B", "C", "Db"};
        String[] chords = {"Dmaj7", "Emin7", "F#min7", "Gmaj7", "A7", "Bmin7", "C#min7b5"};
        this.setMap(notes, "note");
        this.setMap(chords, "chord");
    }

}

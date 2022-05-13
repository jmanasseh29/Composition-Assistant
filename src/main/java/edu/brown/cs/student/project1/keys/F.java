package edu.brown.cs.student.project1.keys;

/**
 * Class outlining notes and chords for F class
 *
 */
public class F extends Key{

    /**
     * Constructor that calls note constructor and sets maps
     */
    public F() {
        String[] notes = {"F", "Gb", "G", "Ab", "A", "Bb", "B", "C", "Db", "D", "Eb", "E"};
        String[] chords = {"Fmaj7", "Gmin7", "Amin7", "Bbmaj7", "C7", "Dmin7", "Emin7b5"};
        this.setMap(notes, "note");
        this.setMap(chords, "chord");
    }

}

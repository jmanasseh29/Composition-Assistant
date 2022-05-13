package edu.brown.cs.student.project1.keys;

/**
 * Class outlining notes and chords for G class
 *
 */
public class G extends Key {

    /**
     * Constructor that calls note constructor and sets maps
     */
    public G() {
        String[] notes = {"G", "Ab", "A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb"};
        String[] chords = {"Gmaj7", "Amin7", "Bmin7", "Cmaj7", "D7", "Emin7", "F#min7b5"};
        this.setMap(notes, "note");
        this.setMap(chords, "chord");
    }

}

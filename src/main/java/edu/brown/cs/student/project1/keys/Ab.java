package edu.brown.cs.student.project1.keys;

/**
 * Class outlining notes and chords for Ab class
 *
 */
public class Ab extends Key {

    /**
     * Constructor that calls note constructor and sets maps
     */
    public Ab() {
        String[] notes = {"Ab", "A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G"};
        String[] chords = {"Abmaj7", "Bbmin7", "Cmin7", "Dbmaj7", "Eb7", "Fmin7", "Gmin7b5"};
        this.setMap(notes, "note");
        this.setMap(chords, "chord");
    }

}

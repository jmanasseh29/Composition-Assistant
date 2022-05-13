package edu.brown.cs.student.project1.keys;

import com.google.common.collect.HashBiMap;

import java.util.HashMap;

/**
 * Class that gives java representation for a key. Designed to be inherited by specific keys
 *
 */
public class Key {
    private HashMap<Integer, String> noteMap;
    private HashBiMap<Integer, String> chordMap;

    /**
     * Default key constructor
     *
     */
    public Key() {
        this.noteMap = new HashMap<>();
        this.chordMap = HashBiMap.create();
    }

    /**
     * Key constructor that sets the maps for notes and chords depending on the key.
     *
     * @param nM
     * @param cM
     */
    public Key(HashMap<Integer, String> nM, HashBiMap<Integer, String> cM) {
        this.noteMap = nM;
        this.chordMap = cM;
    }

    /**
     * Get method for chord map.
     * Bimap allows for bidirectional search on chords.
     *
     * @return chord map
     */
    public HashBiMap<Integer, String> getChordMap() {
        return this.chordMap;
    }

    /**
     * Get method for note map.
     *
     * @return note map
     */
    public HashMap<Integer, String> getNoteMap() {
        return this.noteMap;
    }

    /**
     * Sets either the chord map or note map depending on
     *
     * @param chordsOrNotes array containinig either chords or notes
     * @param type striing determining which map to place array in.
     */
    public void setMap(String[] chordsOrNotes, String type) {
        int i = 1;
        for (String val : chordsOrNotes) {
            if (type.equals("chord")) {
                this.chordMap.put(i, val);
            } else if (type.equals("note")) {
                this.noteMap.put(i, val);
            }
            i ++;
        }
    }
}

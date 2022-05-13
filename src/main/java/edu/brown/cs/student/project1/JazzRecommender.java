package edu.brown.cs.student.project1;


import edu.brown.cs.student.project1.keys.Key;
import edu.brown.cs.student.project1.keys.A;
import edu.brown.cs.student.project1.keys.Ab;
import edu.brown.cs.student.project1.keys.B;
import edu.brown.cs.student.project1.keys.Bb;
import edu.brown.cs.student.project1.keys.C;
import edu.brown.cs.student.project1.keys.D;
import edu.brown.cs.student.project1.keys.Db;
import edu.brown.cs.student.project1.keys.E;
import edu.brown.cs.student.project1.keys.Eb;
import edu.brown.cs.student.project1.keys.F;
import edu.brown.cs.student.project1.keys.G;
import edu.brown.cs.student.project1.keys.Gb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Class that handles recommendation of melody for the jazz genre.
 *
 */
public class JazzRecommender implements Recommender {

    /**
     * Method does stuff (CHANGE)
     *
     * @param key
     * @param _firstChord
     * @param _secondChord
     * @param _thirdChord
     * @param _fourthChord
     * @return Array list of notes
     */
  @Override
  public List<String> recommend(String genre, String key, String _firstChord, String _secondChord, String _thirdChord, String _fourthChord) {

      System.out.println("Jazz Recommendations!");

      /*
        - inputs are genre, key, c1, c2, c3, c4
        - Confirm genre in jazz
        - Pass key into map generator to get map
        - convert chords to numbers using map
        - call actual recommend note func
         */

    String chord1 = _firstChord;
    String chord2 = _secondChord;
    String chord3 = _thirdChord;
    String chord4 = _fourthChord;


    Key curKey = this.getKey(key);
    Integer c1 = curKey.getChordMap().inverse().get(chord1);
    Integer c2 = curKey.getChordMap().inverse().get(chord2);
    Integer c3 = curKey.getChordMap().inverse().get(chord3);
    Integer c4 = curKey.getChordMap().inverse().get(chord4);
    Integer[] numChords = {c1, c2, c3, c4};

    //for (Integer n: numChords) {
    //  System.out.println("chord 1 number Value: " + n);
    //}

        // Perform recommendation
    ArrayList<String> answer = this.generateMelody(numChords, curKey);
    System.out.println(answer);
    return answer;
    }

    /**
     * Handles getting correct key from the inputs.
     * Returns specific key containing note/chord maps
     *
     * @param keyName string input from user outlining key.
     * @return specific Key object depending on param
     */
    public Key getKey(String keyName) {
        switch (keyName) {
            case "C":
                return new C();
            case "Db":
                return new Db();
            case "D":
                return new D();
            case "Eb":
                return new Eb();
            case "E":
                return new E();
            case "F":
                return new F();
            case "Gb":
                return new Gb();
            case "G":
                return new G();
            case "Ab":
                return new Ab();
            case "A":
                return new A();
            case "Bb":
                return new Bb();
            case "B":
                return new B();
        }
        return null;
    }

    /**
     * Recommender function that takes in chord values (as numbers) and key.
     * Uses distribution maps to create recommendation currently
     *
     * @param chords array of chord values as numbers relative to key.
     * @param k Key object used to obtain string note values
     * @return String representing melody recommendation
     */
    public ArrayList<String> generateMelody(Integer[] chords, Key k) {

        /*
        loop through chords via notes on the page
         */
        JazzMap allMaps = new JazzMap();
        HashMap<String, Double> allRhythms = new HashMap<>();
        allRhythms.put("q", 1.0);
        allRhythms.put("8", 0.5);
        allRhythms.put("h", 2.0);
        allRhythms.put("w", 4.0);

        // all 4 bars
        ArrayList<String> fullMelody = new ArrayList<>();
        for (Integer c: chords) {
            double remainingRhythm = 4;
            // each bar melody
            while (remainingRhythm > 0) {
                String randRhythm = allMaps.getRhythms().next();
                double val = allRhythms.get(randRhythm);
                if ((remainingRhythm - val) >= 0) {
                    Integer randNote = allMaps.getRelativeTone().get(c).next();
                    Integer randOctave = allMaps.getOctaves().next();
                    Boolean isRest = allMaps.getRests().next();
                    String noteVal = k.getNoteMap().get(randNote);
                    // ex note string -> "C4/q"
                    // specific to Vexflow API
                    String noteString = noteVal + randOctave + "/" + randRhythm;
                    if (isRest) {
                        // add rest
                        noteString = noteString + "/r";
                    }
                    fullMelody.add(noteString);
                    remainingRhythm = remainingRhythm - val;
                }
            }
        }

        return fullMelody;
    }

}

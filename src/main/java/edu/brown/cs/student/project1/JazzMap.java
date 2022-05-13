package edu.brown.cs.student.project1;


import java.util.HashMap;

/**
 * Class that generates the maps and collections used for choosing random values for notes.
 * It includes tone value (relative to key), rhythms, octaves, and rests.
 *
 */
public class JazzMap {

    private final HashMap<Integer, RandomCollection<Integer>> relativeTone;
    private final RandomCollection<String> rhythms;

    private final RandomCollection<Integer> octaves;
    private final RandomCollection<Boolean> rests;

    /**
     * Default constructor that sets all values.
     *
     */
    public JazzMap() {
        this.relativeTone = this.setRelativeTones();
        this.rhythms = this.setRhythms();
        this.octaves = this.setOctaves();
        this.rests = this.setRests();
    }


    /**
     * Get method for relative tone map to use in recommender.
     *
     * @return relative tone map
     */
    public HashMap<Integer, RandomCollection<Integer>> getRelativeTone() {
        return this.relativeTone;
    }

    /**
     * Get method for rhythm weighted distribution.
     *
     * @return rhythm weighted distribution
     */
    public RandomCollection<String> getRhythms() {
        return this.rhythms;
    }

    /**
     * Get method for octave weighted distribution.
     *
     * @return octave weighted distribution
     */
    public RandomCollection<Integer> getOctaves() {
        return this.octaves;
    }

    /**
     * Get method for rest boolean weighted distribution.
     *
     * @return rest boolean weighted distribution
     */
    public RandomCollection<Boolean> getRests() {
        return this.rests;
    }

    /**
     * Setter that sets the weights for the rest booleans.
     * Used to see if rest should be added in the bar.
     *
     * @return rest boolean weighted distribution
     */
    public RandomCollection<Boolean> setRests() {
        return new RandomCollection<Boolean>().add(10, Boolean.TRUE).add(90, Boolean.FALSE);
    }

    /**
     * Setter that sets the weights for the octaves.
     *
     * @return octave weighted distribution
     */
    public RandomCollection<Integer> setOctaves() {
        return new RandomCollection<Integer>().add(70, 4).add(30, 5);
    }

    /**
     * Setter that sets weights for the rhythms.
     *
     * @return rhythm weighted distribution
     */
    public RandomCollection<String> setRhythms() {
        return new RandomCollection<String>().add(45, "8")
                .add(30, "q")
                .add(15, "h")
                .add(10, "w");
    }

    /**
     * Setter that sets weights for individual notes depending on the relative chord.
     * Each key is a chord value and each value is a distribution.
     *
     * @return relative tones map
     */
    public HashMap<Integer, RandomCollection<Integer>> setRelativeTones() {
        HashMap<Integer, RandomCollection<Integer>> retMap = new HashMap<>();

        for (int i = 1; i < 8; i++) {
            retMap.put(i, this.makeDistribution(i));
        }

        return retMap;
    }

    /**
     * Method takes a chord and returns corresponding distribution for possible notes.
     *
     * @param chord chord represented as an integer
     * @return note weighted distribution for the given chord
     */

    private RandomCollection<Integer> makeDistribution(int chord) {
        switch (chord) {
            case 1:
                return new RandomCollection<Integer>().add(14, 1)
                        .add(0.5, 2)
                        .add(13, 3)
                        .add(0.5, 4)
                        .add(14, 5)
                        .add(3, 6)
                        .add(13, 7)
                        .add(14, 8)
                        .add(0.5, 9)
                        .add(13, 10)
                        .add(0.5, 11)
                        .add(14, 12);
            case 2:
                return new RandomCollection<Integer>().add(14, 1)
                        .add(0.5, 2)
                        .add(14, 3)
                        .add(0.5, 4)
                        .add(13, 5)
                        .add(14, 6)
                        .add(0.5, 7)
                        .add(13, 8)
                        .add(3, 9)
                        .add(14, 10)
                        .add(0.5, 11)
                        .add(13, 12);
            case 3:
                return new RandomCollection<Integer>().add(13, 1)
                        .add(0.5, 2)
                        .add(14, 3)
                        .add(0.5, 4)
                        .add(14, 5)
                        .add(13, 6)
                        .add(0.5, 7)
                        .add(14, 8)
                        .add(0.5, 9)
                        .add(13, 10)
                        .add(3, 11)
                        .add(14, 12);
            case 4:
                return new RandomCollection<Integer>().add(14, 1)
                        .add(0.5, 2)
                        .add(13, 3)
                        .add(0.5, 4)
                        .add(14, 5)
                        .add(14, 6)
                        .add(0.5, 7)
                        .add(14, 8)
                        .add(0.5, 9)
                        .add(14, 10)
                        .add(3, 11)
                        .add(13, 12);
            case 5:
                return new RandomCollection<Integer>().add(13, 1)
                        .add(0.5, 2)
                        .add(14, 3)
                        .add(0.5, 4)
                        .add(13, 5)
                        .add(14, 6)
                        .add(0.5, 7)
                        .add(14, 8)
                        .add(3, 9)
                        .add(13, 10)
                        .add(0.5, 11)
                        .add(14, 12);
            case 6:
                return new RandomCollection<Integer>().add(14, 1)
                        .add(3, 2)
                        .add(13, 3)
                        .add(0.5, 4)
                        .add(14, 5)
                        .add(13, 6)
                        .add(0.5, 7)
                        .add(14, 8)
                        .add(0.5, 9)
                        .add(14, 10)
                        .add(0.5, 11)
                        .add(13, 12);
            case 7:
                return new RandomCollection<Integer>().add(13, 1)
                        .add(3, 2)
                        .add(14, 3)
                        .add(0.5, 4)
                        .add(13, 5)
                        .add(14, 6)
                        .add(0.5, 7)
                        .add(13, 8)
                        .add(0.5, 9)
                        .add(14, 10)
                        .add(0.5, 11)
                        .add(14, 12);
        }
        return null;
    }

}

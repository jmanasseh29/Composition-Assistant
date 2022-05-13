package edu.brown.cs.student.project1;

import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

/**
 * Class that handles weightted random distribution of any objects.
 * Code sourced from https://localcoder.org/random-weighted-selection-in-java
 *
 * @param <E> Determines object that weights are applied to
 */
public class RandomCollection<E> {
    private final NavigableMap<Double, E> map = new TreeMap<Double, E>();
    private final Random random;
    private double total = 0;

    public RandomCollection() {
        this(new Random());
    }

    public RandomCollection(Random random) {
        this.random = random;
    }

    /**
     * Method to add a sinigular weight distribution to the map.
     *
     * @param weight double representing percentage weight of following param
     * @param result object being added to the map
     * @return current RandomCollection object
     */
    public RandomCollection<E> add(double weight, E result) {
        if (weight <= 0) return this;
        total += weight;
        map.put(total, result);
        return this;
    }

    /**
     * Method that gives a random value frrom the weighted tree.
     *
     * @return Object of type E giving random weighted value
     */
    public E next() {
        double value = random.nextDouble() * total;
        return map.higherEntry(value).getValue();
    }
}

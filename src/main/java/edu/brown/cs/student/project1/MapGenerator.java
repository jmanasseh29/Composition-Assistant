package edu.brown.cs.student.project1;


import java.util.HashMap;
import java.util.Locale;

/**
 * This class will take in the key inputted by the user through either the REPL or the frontend and then generate a hashmap where the key
 * is the name of a note and the value is its assigned numerical value.  For example, if the user selects the key or c major, the c chord will be
 * assigned a value of 1, d will have a value of 2 and so on.
 */


public class MapGenerator {

    private HashMap<String, Integer> keyToInteger;
    private HashMap<Integer, String> integerToKey;


    private String userKey = new String();

    public MapGenerator(){
    }

    /**
     * This method takes in the User Inputs and fills in a hashmap assigning values to every note in a scale dependent on which
     * key the user desires.
     * @param commandInputs
     * @return
     */

    public HashMap<Integer, String> generateIntToKeyMap(String[] commandInputs){

        integerToKey = new HashMap<>();

        System.out.println(commandInputs[2]);
        userKey = commandInputs[2];

        if (userKey.equals("c")){

            integerToKey.put(1, "c");
            integerToKey.put(2, "d");
            integerToKey.put(3, "e");
            integerToKey.put(4, "f");
            integerToKey.put(5, "g");
            integerToKey.put(6, "a");
            integerToKey.put(7, "b");

        } else if (userKey.equals("d")){

        }
        return integerToKey;
    }




    public HashMap<String, Integer> generateKeyToIntMap(String[] commandInputs){

        keyToInteger = new HashMap<>();

        System.out.println(commandInputs[2]);
        userKey = commandInputs[2];

        if (userKey.equals("c")){

            keyToInteger.put("c", 1);
            keyToInteger.put("d", 2);
            keyToInteger.put("e", 3);
            keyToInteger.put("f", 4);
            keyToInteger.put("g", 5);
            keyToInteger.put("a", 6);
            keyToInteger.put("b", 7);

            System.out.println("map " + keyToInteger);

        } else if (userKey.equals("d")){

        }

        return keyToInteger;

    }







}

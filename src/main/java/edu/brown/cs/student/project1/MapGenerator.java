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





    public MapGenerator(){
    }

    /**
     * This method takes in the User Inputs and fills in a hashmap assigning values to every note in a scale dependent on which
     * key the user desires.
     * @param commandInputs
     * @return
     */

    public HashMap<Integer, String> generateIntToKeyMap(String[] commandInputs){

        HashMap<Integer, String> integerToKey = new HashMap<>();
        String userKey;


        System.out.println(commandInputs[2]);
        userKey = commandInputs[2].toUpperCase();

        if (userKey.equals("C")){

            integerToKey.put(1, "C");
            integerToKey.put(2, "D");
            integerToKey.put(3, "E");
            integerToKey.put(4, "F");
            integerToKey.put(5, "G");
            integerToKey.put(6, "A");
            integerToKey.put(7, "B");

        } else if (userKey.equals("D")){

            integerToKey.put(1, "D");
            integerToKey.put(2, "E");
            integerToKey.put(3, "F#");
            integerToKey.put(4, "G");
            integerToKey.put(5, "A");
            integerToKey.put(6, "B");
            integerToKey.put(7, "C#");

        }else if (userKey.equals("E")){

            integerToKey.put(1, "E");
            integerToKey.put(2, "F#");
            integerToKey.put(3, "G#");
            integerToKey.put(4, "A");
            integerToKey.put(5, "B");
            integerToKey.put(6, "C#");
            integerToKey.put(7, "D#");


        }else if (userKey.equals("F")){

            integerToKey.put(1, "F");
            integerToKey.put(2, "G");
            integerToKey.put(3, "A");
            integerToKey.put(4, "Bb");
            integerToKey.put(5, "C");
            integerToKey.put(6, "D");
            integerToKey.put(7, "E");

        }else if (userKey.equals("G")){

            integerToKey.put(1, "G");
            integerToKey.put(2, "A");
            integerToKey.put(3, "B");
            integerToKey.put(4, "C");
            integerToKey.put(5, "D");
            integerToKey.put(6, "E");
            integerToKey.put(7, "F#");

        }else if (userKey.equals("A")){

            integerToKey.put(1, "A");
            integerToKey.put(2, "B");
            integerToKey.put(3, "C#");
            integerToKey.put(4, "D");
            integerToKey.put(5, "E");
            integerToKey.put(6, "F#");
            integerToKey.put(7, "G#");

        }else if (userKey.equals("B")){

            integerToKey.put(1, "B");
            integerToKey.put(2, "C#");
            integerToKey.put(3, "D#");
            integerToKey.put(4, "E");
            integerToKey.put(5, "F#");
            integerToKey.put(6, "G#");
            integerToKey.put(7, "A#");

        }
        return integerToKey;
    }

    public HashMap<String, Integer> generateKeyToIntMap(String[] commandInputs){

        HashMap<String, Integer> keyToInteger = new HashMap<>();
        String userKey;

        userKey = commandInputs[2].toUpperCase();

        if (userKey.equals("C")){

            keyToInteger.put("C", 1);
            keyToInteger.put("D", 2);
            keyToInteger.put("E", 3);
            keyToInteger.put("F", 4);
            keyToInteger.put("G", 5);
            keyToInteger.put("A", 6);
            keyToInteger.put("B", 7);

            System.out.println("map " + keyToInteger);

        }else if (userKey.equals("D")){

            keyToInteger.put("D", 1);
            keyToInteger.put("E", 2);
            keyToInteger.put("F#",3);
            keyToInteger.put("G", 4);
            keyToInteger.put("A", 5);
            keyToInteger.put("B", 6);
            keyToInteger.put("C#",7);

        }else if (userKey.equals("E")){

            keyToInteger.put("E", 1);
            keyToInteger.put("F#", 2);
            keyToInteger.put("G#", 3);
            keyToInteger.put("A", 4);
            keyToInteger.put("B", 5);
            keyToInteger.put("C#", 6);
            keyToInteger.put("D#", 7);

        }else if (userKey.equals("F")){

            keyToInteger.put("F", 1);
            keyToInteger.put("G", 2);
            keyToInteger.put("A", 3);
            keyToInteger.put("Bb", 4);
            keyToInteger.put("C", 5);
            keyToInteger.put("D", 6);
            keyToInteger.put("E", 7);

        }else if (userKey.equals("G")){

            keyToInteger.put("G", 1);
            keyToInteger.put("A", 2);
            keyToInteger.put("B", 3);
            keyToInteger.put("C", 4);
            keyToInteger.put("D", 5);
            keyToInteger.put("E", 6);
            keyToInteger.put("F#", 7);

        }else if (userKey.equals("A")){

            keyToInteger.put("A", 1);
            keyToInteger.put("B", 2);
            keyToInteger.put("C#", 3);
            keyToInteger.put("D", 4);
            keyToInteger.put("E", 5);
            keyToInteger.put("F#", 6);
            keyToInteger.put("G#", 7);

        }else if (userKey.equals("B")){

            keyToInteger.put("B", 1);
            keyToInteger.put("C#", 2);
            keyToInteger.put("D#", 3);
            keyToInteger.put("E", 4);
            keyToInteger.put("F#", 5);
            keyToInteger.put("G#", 6);
            keyToInteger.put("A#", 7);

        }
        return keyToInteger;

    }







}

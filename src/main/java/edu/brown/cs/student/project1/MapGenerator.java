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
     * @return
     */

    public HashMap<Integer, String> generateIntToKeyMap(String key, String _firstChord, String _secondChord, String _thirdChord, String _fourthChord){

        HashMap<Integer, String> integerToKey = new HashMap<>();
        String userKey;
        System.out.println(key);
        userKey = key.toUpperCase();

        if (userKey.equals("C")){

            integerToKey.put(1, "Cmaj7");
            integerToKey.put(2, "Dmin7");
            integerToKey.put(3, "Emin7");
            integerToKey.put(4, "Fmaj7");
            integerToKey.put(5, "G7");
            integerToKey.put(6, "Amin7");
            integerToKey.put(7, "Bmin7b5");

        } else if (userKey.equals("D")){

            integerToKey.put(1, "Dmaj7");
            integerToKey.put(2, "Emin7");
            integerToKey.put(3, "F#min7");
            integerToKey.put(4, "Gmaj7");
            integerToKey.put(5, "A7");
            integerToKey.put(6, "Bmin7");
            integerToKey.put(7, "C#min7b5");

        }else if (userKey.equals("E")){

            integerToKey.put(1, "Emaj7");
            integerToKey.put(2, "F#min7");
            integerToKey.put(3, "G#");
            integerToKey.put(4, "Amaj7");
            integerToKey.put(5, "B7");
            integerToKey.put(6, "C#min7");
            integerToKey.put(7, "D#min7b5");

        }else if (userKey.equals("F")){

            integerToKey.put(1, "Fmaj7");
            integerToKey.put(2, "Gmin7");
            integerToKey.put(3, "Amin7");
            integerToKey.put(4, "Bbmaj7");
            integerToKey.put(5, "C7");
            integerToKey.put(6, "Dmin7");
            integerToKey.put(7, "Emin7b5");

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

    public HashMap<String, Integer> generateKeyToIntMap(String key, String _firstChord, String _secondChord, String _thirdChord, String _fourthChord){

        HashMap<String, Integer> keyToInteger = new HashMap<>();
        String userKey;
        userKey = key.toUpperCase();

        if (userKey.equals("C")){

            keyToInteger.put("Cmaj7", 1);
            keyToInteger.put("Dmin7", 2);
            keyToInteger.put("Emin7", 3);
            keyToInteger.put("Fmaj7", 4);
            keyToInteger.put("G7", 5);
            keyToInteger.put("Amin7", 6);
            keyToInteger.put("Bmin7b5", 7);


        }else if (userKey.equals("D")){

            keyToInteger.put("Dmaj7", 1);
            keyToInteger.put("Emin7", 2);
            keyToInteger.put("F#min7",3);
            keyToInteger.put("Gmaj7", 4);
            keyToInteger.put("A7", 5);
            keyToInteger.put("Bmin7", 6);
            keyToInteger.put("C#min7b5",7);

        }else if (userKey.equals("E")){

            keyToInteger.put("Emaj7", 1);
            keyToInteger.put("F#min7", 2);
            keyToInteger.put("G#min7", 3);
            keyToInteger.put("Amaj7", 4);
            keyToInteger.put("B7", 5);
            keyToInteger.put("C#min7", 6);
            keyToInteger.put("D#min7b5", 7);

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

package edu.brown.cs.student.project1;


import java.util.HashMap;
import java.util.Locale;

/**
 * This class will take in the key inputted by the user through either the REPL or the frontend and then generate a hashmap where the key
 * is the name of a note and the value is its assigned numerical value.  For example, if the user selects the key or c major, the c chord will be
 * assigned a value of 1, d will have a value of 2 and so on.
 */


public class MapGenerator {

    private HashMap<Integer, String> keyIntegerAssignments;
    private String userKey;

    public MapGenerator(String[] commandInputs){
    }

    /**
     * This method takes in the User Inputs and fills in a hashmap assigning values to every note in a scale dependent on which
     * key the user desires.
     * @param commandInputs
     * @return
     */

    public HashMap<Integer, String> generateKeyIntMap(String[] commandInputs){

        keyIntegerAssignments = new HashMap<>();
        commandInputs[2] = userKey;

        if (userKey.toLowerCase().equals("c")){

            keyIntegerAssignments.put(1, "c");
            keyIntegerAssignments.put(2, "d");
            keyIntegerAssignments.put(3, "e");
            keyIntegerAssignments.put(4, "f");
            keyIntegerAssignments.put(5, "g");
            keyIntegerAssignments.put(6, "a");
            keyIntegerAssignments.put(7, "b");

        } else if (userKey.toLowerCase().equals("d")){




        }










        return keyIntegerAssignments;

    }








}

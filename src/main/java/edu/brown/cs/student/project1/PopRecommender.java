package edu.brown.cs.student.project1;

import java.util.HashMap;

public class PopRecommender implements Recommender{

   MapGenerator _mapGenerator;
   HashMap<String, Integer> _generatedMap;

    //chord progressions that will be used as a baseline for the recommendations
    Integer[] _chordProgression1 = {1, 4, 5, 4};
    Integer[] _chordProgression2 = {1, 5, 6, 4};
    Integer[] _chordProgression3 = {1, 6, 4, 5};

    String _firstChord;
    String _secondChord;
    String _thirdChord;
    String _fourthChord;

    /**
     * Recommender will return as many notes to fill a bar
     * @param commandInputs inputted genre, key, and four chords
     */

    @Override
    public void recommend(String[] commandInputs) {

        this._firstChord = commandInputs[3];
        this._secondChord = commandInputs[4];
        this._thirdChord = commandInputs[5];
        this._fourthChord = commandInputs[6];

        this._generatedMap = new HashMap<>();

    System.out.println("genre: " +commandInputs[1] + "  key: "+ commandInputs[2] + "  chord 1: "+ commandInputs[3] + "  chord 2: "+  commandInputs[4] + "  chord 3: "+  commandInputs[5] + "  chord 4: "+  commandInputs[6]);
    System.out.println("Generating Recommendations ...");

        this._mapGenerator = new MapGenerator();
        this._generatedMap = this._mapGenerator.generateKeyToIntMap(commandInputs);

    System.out.println("first chord number " + this._generatedMap.get(this._firstChord));











    


    }

}

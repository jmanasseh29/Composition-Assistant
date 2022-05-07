package edu.brown.cs.student.project1;

import org.checkerframework.checker.units.qual.A;
import java.sql.Array;

import java.util.ArrayList;
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

    ArrayList<Integer> _matchList;

    int _firstChordInt;
    int _secondChordInt;
    int _thirdChordInt;
    int _fourthChordInt;


    int _chordProg1SimilarityIndex = 0;
    int _chordProg2SimilarityIndex = 0;
    int _chordProg3SimilarityIndex = 0;

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

    //System.out.println("first chord number " + this._generatedMap.get(this._firstChord));
    //System.out.println("second chord number " + this._generatedMap.get(this._secondChord));
    //System.out.println("third chord number " + this._generatedMap.get(this._thirdChord));
    //System.out.println("fourth chord number " + this._generatedMap.get(this._fourthChord));

    _matchList = new ArrayList<>();

    this._firstChordInt = this._generatedMap.get(this._firstChord);
    this._secondChordInt = this._generatedMap.get(this._secondChord);
    this._thirdChordInt = this._generatedMap.get(this._thirdChord);
    this._fourthChordInt = this._generatedMap.get(this._fourthChord);


    if (this._firstChordInt == 1 || this._firstChordInt == 4 || this._firstChordInt == 5 || this._firstChordInt == 6){
        this._matchList.add(this._firstChordInt);
        }

    if (this._secondChordInt == 1 || this._secondChordInt == 4 || this._secondChordInt == 5 || this._secondChordInt == 6){
        this._matchList.add(this._secondChordInt);
        }

    if (this._thirdChordInt == 1 || this._thirdChordInt == 4 || this._thirdChordInt == 5 || this._thirdChordInt == 6){
        this._matchList.add(this._thirdChordInt);
        }

    if (this._fourthChordInt == 1 || this._fourthChordInt == 4 || this._fourthChordInt == 5 || this._fourthChordInt == 6){
        this._matchList.add(this._fourthChordInt);
        }

    System.out.println("match list: " + this._matchList);


    for (int i = 0; i < this._chordProgression1.length ; i++){
        for (int j = 0; j < this._matchList.size(); j++){
            if (this._matchList.get(j).equals(this._chordProgression1[i])){
                this._chordProg1SimilarityIndex = this._chordProg1SimilarityIndex + 1; //increment similarity checker by 1 for ever common chord between the
                                                                             // set chord progressions and the user's desired chords.
            }
        }
    }

        for (int i = 0; i < this._chordProgression2.length ; i++){
            for (int j = 0; j < this._matchList.size(); j++){
                if (this._matchList.get(j).equals(this._chordProgression2[i])){
                    this._chordProg2SimilarityIndex = this._chordProg2SimilarityIndex + 1; //increment similarity checker by 1 for ever common chord between the
                    // set chord progressions and the user's desired chords.
                }
            }
        }

        for (int i = 0; i < this._chordProgression3.length ; i++){
            for (int j = 0; j < this._matchList.size(); j++){
                if (this._matchList.get(j).equals(this._chordProgression3[i])){
                    this._chordProg3SimilarityIndex = this._chordProg3SimilarityIndex + 1; //increment similarity checker by 1 for ever common chord between the
                    // set chord progressions and the user's desired chords.
                }
            }
        }


        System.out.println(" chord 1 similar: " + this._chordProg1SimilarityIndex);
        System.out.println(" chord 2 similar: " + this._chordProg2SimilarityIndex);
        System.out.println(" chord 3 similar: " + this._chordProg3SimilarityIndex);


    }

}

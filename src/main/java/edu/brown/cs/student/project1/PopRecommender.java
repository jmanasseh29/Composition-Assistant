package edu.brown.cs.student.project1;

import org.checkerframework.checker.units.qual.A;
import java.sql.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class PopRecommender implements Recommender{

   MapGenerator _mapGenerator;
   HashMap<String, Integer> _generatedMap;
   HashMap<Integer, String> _intToString;

    //chord progressions that will be used as a baseline for the recommendations
    Integer[] _chordProgression1 = {1, 4, 5, 4};
    Integer[] _chordProgression2 = {1, 5, 6, 4};
    Integer[] _chordProgression3 = {1, 6, 4, 5};

    //idea: check for entire;y equivalent chord inputs and only run more random algorithm if there is not complete equivalence

    String _firstChord;
    String _secondChord;
    String _thirdChord;
    String _fourthChord;

    ArrayList<Integer> _matchList;

    int _firstChordInt;
    int _secondChordInt;
    int _thirdChordInt;
    int _fourthChordInt;

    /**
     * Recommender will return as many notes to fill a bar
     * @param commandInputs inputted genre, key, and four chords
     */

    @Override
    public void recommend(String[] commandInputs) {

        int _chordProg1SimilarityIndex = 0;
        int _chordProg2SimilarityIndex = 0;
        int _chordProg3SimilarityIndex = 0;

        this._firstChord = commandInputs[3];
        this._secondChord = commandInputs[4];
        this._thirdChord = commandInputs[5];
        this._fourthChord = commandInputs[6];

        this._generatedMap = new HashMap<>();
        this._intToString = new HashMap<>();

    //System.out.println("genre: " +commandInputs[1] + "  key: "+ commandInputs[2] + "  chord 1: "+ commandInputs[3] + "  chord 2: "+  commandInputs[4] + "  chord 3: "+  commandInputs[5] + "  chord 4: "+  commandInputs[6]);


        this._mapGenerator = new MapGenerator();

        //REFACTOR
        this._generatedMap = this._mapGenerator.generateKeyToIntMap(commandInputs);
        this._intToString = this._mapGenerator.generateIntToKeyMap(commandInputs);

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

    //System.out.println("match list: " + this._matchList);


        for (int i = 0; i < this._chordProgression1.length ; i++){
            for (int j = 0; j < this._matchList.size(); j++){
            if (this._matchList.get(j).equals(this._chordProgression1[i])){
                _chordProg1SimilarityIndex = _chordProg1SimilarityIndex + 1; //increment similarity checker by 1 for ever common chord between the
                                                                             // set chord progressions and the user's desired chords.
                }
            }
        }

        for (int i = 0; i < this._chordProgression2.length ; i++){
            for (int j = 0; j < this._matchList.size(); j++){
                if (this._matchList.get(j).equals(this._chordProgression2[i])){
                    _chordProg2SimilarityIndex = _chordProg2SimilarityIndex + 1; //increment similarity checker by 1 for ever common chord between the
                    // set chord progressions and the user's desired chords.
                }
            }
        }

        for (int i = 0; i < this._chordProgression3.length ; i++){
            for (int j = 0; j < this._matchList.size(); j++){
                if (this._matchList.get(j).equals(this._chordProgression3[i])){
                    _chordProg3SimilarityIndex = _chordProg3SimilarityIndex + 1; //increment similarity checker by 1 for ever common chord between the
                    // set chord progressions and the user's desired chords.
                }
            }
        }

      //compare three similarity indices so that we can choose which one to base predictions from.  If multiple
      // chord progressions have equal similarity indices are then added into a list and the tie is broken using randomization

      //while loop to ensure incrementing doesn't result in repeated equivalence (for example in case that similarity indices are 2, 2, 3)
      //this.chordSimilarityIndexRandomChoice(this._chordProg1SimilarityIndex, this._chordProg2SimilarityIndex, this._chordProg3SimilarityIndex);


        while (_chordProg1SimilarityIndex == _chordProg3SimilarityIndex){
            _chordProg3SimilarityIndex = _chordProg3SimilarityIndex + (int)(Math.random()*7);
            System.out.println("adding 3");

        }

        while (_chordProg1SimilarityIndex == _chordProg2SimilarityIndex || _chordProg2SimilarityIndex == _chordProg3SimilarityIndex){
            _chordProg1SimilarityIndex = _chordProg1SimilarityIndex + (int)(Math.random()*7) ;
            _chordProg2SimilarityIndex = _chordProg2SimilarityIndex + (int)(Math.random()*7);
            System.out.println("adding 1");
            System.out.println("adding 2");

        }




        System.out.println(" chord 1 similar: " + _chordProg1SimilarityIndex);
        System.out.println(" chord 2 similar: " + _chordProg2SimilarityIndex);
        System.out.println(" chord 3 similar: " + _chordProg3SimilarityIndex);


        if (_chordProg2SimilarityIndex > _chordProg1SimilarityIndex){

            if (_chordProg2SimilarityIndex > _chordProg3SimilarityIndex){

                firstChordProgRecommender();
                //secondChordProgRecommender();
            }

            if (_chordProg2SimilarityIndex < _chordProg3SimilarityIndex ){

                firstChordProgRecommender();
                // thirdChordProgRecommender();
            }
        }


        if (_chordProg2SimilarityIndex < _chordProg1SimilarityIndex){

            if (_chordProg1SimilarityIndex > _chordProg3SimilarityIndex){
                this.firstChordProgRecommender();
            }

            if (_chordProg1SimilarityIndex < _chordProg3SimilarityIndex ){
                this.thirdChordProgRecommender();
            }

        }

    }


    //Integer[] _chordProgression1 = {1, 4, 5, 4};
    public String firstChordProgRecommender(){

        double _barCounter;
        String _noteRhythm;
        String _note;
        String _longOutputNoteString = "";

        System.out.println("Recommending based on Chord Progression 1");

        _barCounter = 0;

        while (_barCounter < 8){

            for (int i = 0; i < _chordProgression1.length ; i ++){

                _noteRhythm = generateRhythm();

                _note = _intToString.get(_chordProgression1[i]);



               // System.out.println(_note + _noteRhythm);

                if (_longOutputNoteString.equals("")){
                    _longOutputNoteString = _longOutputNoteString  + _note + "5" + "/" + _noteRhythm;

                } else{
                    _longOutputNoteString = _longOutputNoteString  +", " + _note + "5" + "/" + _noteRhythm;
                }



                //keeps track of whether enough/too many notes have been generated
                if (_noteRhythm.equals("q")) {
                    _barCounter = _barCounter + 1;
                } else if(_noteRhythm.equals("8")){
                    _barCounter = _barCounter + 0.5;
                } else if(_noteRhythm.equals("h")){
                    _barCounter = _barCounter + 2;
                } else if (_noteRhythm.equals("w")) {
                    _barCounter = _barCounter + 4;
                }

            }

        }
        System.out.println(_longOutputNoteString);
        return _longOutputNoteString;

    }




    //Integer[] _chordProgression2 = {1, 5, 6, 4};
    public void secondChordProgRecommender(){
        System.out.println("Recommending based on Chord Progression 2");
    }


    //Integer[] _chordProgression3 = {1, 6, 4, 5};
    public void thirdChordProgRecommender(){
        System.out.println("Recommending based on Chord Progression 3");
    }





    String rhythm;
    public String generateRhythm() {

        int rand_int = (int) (Math.random() * 3);

        switch (rand_int) {

            //eighth note
            case 0 :
                rhythm = "8" ;
                break;

            //sixteenth note
            case 1 :
                rhythm = "h" ;
                break;

            //whole note
            case 2 :
                rhythm = "q";
                break;

            default:
                rhythm = "w";
                break;
        }

    return rhythm;

    }









}

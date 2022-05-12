package edu.brown.cs.student.project1;

import java.util.List;

public interface Recommender {

    List<String> recommend(String key, String _firstChord, String _secondChord, String _thirdChord, String _fourthChord);

}

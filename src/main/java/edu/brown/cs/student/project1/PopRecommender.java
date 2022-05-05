package edu.brown.cs.student.project1;

public class PopRecommender implements Recommender{


    @Override
    public void recommend(String[] commandInputs) {

        System.out.println("genre: " +commandInputs[1] + "  key: "+ commandInputs[2] + "  chord 1: "+ commandInputs[3] + "  chord 2: "+  commandInputs[4] + "  chord 3: "+  commandInputs[5] + "  chord 4: "+  commandInputs[6]);
        System.out.println("Generating Recommendations ...");

    }

}

package edu.brown.cs.student.project1;

public class PopRecommender implements Recommender{

    @Override
    public void recommend(String[] commandInputs) {

        System.out.println("these are your command inputs: " +  commandInputs[0] +"  "+ commandInputs[1] +"  "+  commandInputs[2]);

    }

}

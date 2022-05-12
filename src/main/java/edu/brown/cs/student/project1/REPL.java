//package edu.brown.cs.student.project1;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//
//public final class REPL {
//
//  private HashMap<String, Recommender> commandDatabase;
//  String[] tokenList; //tokenized array list to be passed in with command and terminal entries
//  static String[] testtokenList; //only to be passed thru for testing
//
//  public REPL() {
//    this.commandDatabase = new HashMap<String, Recommender>();
//    this.buildCommandDatabase();
//  }
//
//  /**
//   * This method creates a key value store of commands mapping from inputted commands (parsed from the terminal
//   * by the repl to an instance of a command class which can then perform the appropriate run method.
//   */
//
//  public void buildCommandDatabase() {
//
//    //add commands here
//    this.commandDatabase.put("pop_recommendation", new PopRecommender());
//
//  }
//
//  /**
//   * The repl simply parses terminal input and tokenized this input into an array of strings which can then
//   * be passed into other methods and utilized
//   * @param bufferedReader
//   * @throws IOException
//   */
//
//  public void REPLFunctionality(BufferedReader bufferedReader) throws IOException { //error checking for .readLine method
//
//    String line = "";
//
//    while ((line = bufferedReader.readLine()) != null) {
//
//      tokenList = line.split("\\s+(?=((\\\\[\\\\\"]|[^\\\\\"])*\"(\\\\[\\\\\"]|[^\\\\\"])*\")*(\\\\[\\\\\"]|[^\\\\\"])*$)"); //site //"\\s+(?=((\\\\[\\\\\"]|[^\\\\\"])*\"(\\\\[\\\\\"]|[^\\\\\"])*\")*(\\\\[\\\\\"]|[^\\\\\"])*$)"
//      testtokenList = line.split("\\s+(?=((\\\\[\\\\\"]|[^\\\\\"])*\"(\\\\[\\\\\"]|[^\\\\\"])*\")*(\\\\[\\\\\"]|[^\\\\\"])*$)");
//
//      if (this.commandDatabase.containsKey(tokenList[0])) {
//        this.commandDatabase.get(tokenList[0]).recommend(tokenList);
//      } else {
//        System.out.println("ERROR:");
//      }
//
//    }
//
//  }
//
//  /**
//   * this method is only used for testing to verify that the REPL is correctly parsing
//   * commmand input and tokenizing
//   */
//
//  public String[] returnTokenList(){
//    return testtokenList;
//  }
//
//}
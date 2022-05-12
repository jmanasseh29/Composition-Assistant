package edu.brown.cs.student.project1;


// look into using these imports for your REPL!

import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import spark.Request;
import spark.Response;
import spark.Spark;
import org.json.JSONObject;
import spark.Route;
//import com.oracle.javafx.jmx.json.JSONException;
import org.json.JSONException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * The Main class of our project. This is where execution begins.
 */
public final class Main {

  // use port 4567 by default when running server
  private static final int DEFAULT_PORT = 4567;

  /**
   * The initial method called when execution begins.
   *
   * @param args An array of command line arguments
   */
  public static void main(String[] args) {
    new Main(args).run();
  }


  private String[] args;

  private Main(String[] args) {
    this.args = args;
  }

  private void run() {
    // set up parsing of command line flags
    OptionParser parser = new OptionParser();

    // "./run --gui" will start a web server
    parser.accepts("gui");

    // use "--port <n>" to specify what port on which the server runs
    parser.accepts("port").withRequiredArg().ofType(Integer.class)
        .defaultsTo(DEFAULT_PORT);

    OptionSet options = parser.parse(args);
    if (options.has("gui")) {

      runSparkServer((int) options.valueOf("port"));

    }

//    REPL repl = new REPL();
//    try {
//      //added
//      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//      repl.REPLFunctionality(bufferedReader);
//    } catch (IOException e) {
//      System.out.println("ERROR: no more entries"); //testing for io exception
//
//    }
  }


  private static void runSparkServer(int port) {
    Spark.port(port);
    Spark.externalStaticFileLocation("src/main/resources/static");

    Spark.options("/*", (request, response) -> {
      String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
      if (accessControlRequestHeaders != null) {
        response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
      }

      String accessControlRequestMethod = request.headers("Access-Control-Request-Method");

      if (accessControlRequestMethod != null) {
        response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
      }

      return "OK";
    });

    Spark.before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));

    // Put Routes Here
    Spark.post("/recommendations", new RecsHandler());

    Spark.init();
  }

  //why static?
  static PopRecommender popRecommender = new PopRecommender();

  private static class RecsHandler implements Route {

    @Override

    public String handle(Request req, Response res) throws JSONException, org.json.JSONException {

      JSONObject reqJson = null;
      String chord1;
      String chord2;
      String chord3;
      String chord4;
      String genre;
      String key;

      try {
        // Put the request's body in JSON format
        reqJson = new JSONObject(req.body());
      } catch (org.json.JSONException e) {
        e.printStackTrace();
      }

      assert reqJson != null;

      chord1 = reqJson.getString("chord1");
      chord2 = reqJson.getString("chord2");
      chord3 = reqJson.getString("chord3");
      chord4 = reqJson.getString("chord4");
      genre = reqJson.getString("genre");
      key = reqJson.getString("key");

      //example
     // List<String> recommendations = CHANGE TO RECOMMENDATION FUNCTION[ MatchMaker.makeMatches(sunVal, moonVal, risingVal); ]
      List<String> recommendations = popRecommender.recommend(key, chord1, chord2, chord3, chord4);

      Gson GSON = new Gson();
      Map<String, Object> recommendationsMap = ImmutableMap.of("matches", recommendations);
      return GSON.toJson(recommendationsMap);
      //return null; // placeholder
    }
  }
}
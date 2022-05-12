package RecommenderTest;
import edu.brown.cs.student.project1.MapGenerator;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


public class MapGenerationTest {

    MapGenerator _mapGenerator = new MapGenerator();

    @Test
    public void MapGenerate() {

        String[] _potentialInput = {"pop_recommendation", "pop", "D", "F#", "G", "C#", "B"};
        assertEquals(_mapGenerator.generateIntToKeyMap(_potentialInput).get(2), "E");

    }

    @Test
    public void MapGen2() {

        String[] _potentialInput = {"pop_recommendation", "pop", "E", "F#", "G#", "C#", "D#"};
        assertEquals(_mapGenerator.generateIntToKeyMap(_potentialInput).get(1), "E");

    }






}

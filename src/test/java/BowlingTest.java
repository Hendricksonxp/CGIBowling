import org.junit.Ignore;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BowlingTest {

    @Test
    public void hookUp() {
        assertTrue(true);
    }

    @Test
    public void allGutterBallsScoresZero() {
        int[] rolls = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.score();
        assertEquals(0, result);
    }

    @Test
    public void openFramesScores20(){
        int[] rolls = {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.score();
        assertEquals(20, result);
    }

    @Test
    public void spareGameScores29(){
        int[] rolls = {9,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.score();
        assertEquals(29, result);
    }
}
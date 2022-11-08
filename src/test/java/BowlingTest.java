import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BowlingTest {

    @Test
    public void hookUp(){
        assertTrue(true);
    }
    @Test
    public void allMissesScoresZero(){
        int[] rolls = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.score();
        assertEquals(0, result);
    }

    @Test
    public void allOnesScoreTwenty(){
        int[] rolls = {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.score();
        assertEquals(20, result);
    }

    @Test
    public void spareFrameScoresTwentyNine(){
        int[] rolls = {1,1, 9,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.score();
        assertEquals(29, result);
    }

    @Test
    public void strikeFrameScoresThirty(){
        int[] rolls = {1,1, 10, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.score();
        assertEquals(30, result);
    }
}

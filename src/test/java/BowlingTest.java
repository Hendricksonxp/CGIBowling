import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BowlingTest {

    @Test
    public void hookUp() {
        assertTrue(true);
    }

    @Test
    public void allMisses(){
        int[] rolls = {0,0, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.score();

        assertEquals(0, result);
    }

    @Test
    public void openFrame(){
        int[] rolls = {1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.score();

        assertEquals(30, result);
    }

    @Test
    public void spare(){
        int[] rolls = {0,0, 4,6, 2,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.score();

        assertEquals(14, result);
    }

    @Test
    public void betterSpare(){
        int[] rolls = {5,0, 4,6, 2,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.score();

        assertEquals(19, result);
    }

    @Test
    public void strike(){
        int[] rolls = {5,0, 10, 2,4, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.score();

        assertEquals(27, result);
    }
}

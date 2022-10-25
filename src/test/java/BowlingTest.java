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
}

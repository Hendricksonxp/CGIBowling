import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BowlingTest {

    @Test
    public void hookUp(){
        assertTrue(true);
    }

    @Test
    public void allGutters(){
        //arrange
        int[]rolls = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        BowlingGame game = new BowlingGame(rolls);
        //act
        int result = game.totalScore();

        //assert
        assertEquals(0,result);

    }

}

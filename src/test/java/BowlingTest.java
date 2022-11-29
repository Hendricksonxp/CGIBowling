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
    public void allGutters(){
        //arrange
        int[]rolls = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        BowlingGame game = new BowlingGame(rolls);
        //act
        int result = game.totalScore();

        //assert
        assertEquals(0,result);
    }

    @Test
    public void openFrame(){
        int[]rolls = {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.totalScore();
        assertEquals(20,result);
    }

    @Test
    public void spareFrame(){
        int[]rolls = {1,9, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
        BowlingGame game = new BowlingGame(rolls);
        int result = game.totalScore();
        assertEquals(29,result);
    }

}

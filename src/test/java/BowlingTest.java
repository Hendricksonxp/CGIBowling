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
        //Arrange
        int[] rolls = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        BowlingGame game = new BowlingGame(rolls);

        //Act
        int result = game.score();

        //Assert
        assertEquals(0, result);
    }
}
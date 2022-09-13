public class BowlingGame {
    private final int[] rolls;

    public BowlingGame(int[] rolls) {
        this.rolls = rolls;
    }

    public int score() {
        int result = 0;
        for (int roll:rolls) {
            result += roll;
        }
        return result;
    }
}

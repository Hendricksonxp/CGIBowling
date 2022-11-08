public class BowlingGame {
    private final int[] rolls;

    public BowlingGame(int[] rolls) {
        this.rolls = rolls;
    }

    public int score() {
        int score = 0;
        for (int roll:rolls) {
           score += roll;
        }
        return score;
    }

}

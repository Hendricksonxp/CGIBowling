public class BowlingGame {
    private final int[] rolls;

    public BowlingGame(int[] rolls) {
        this.rolls = rolls;
    }

    public int score() {
        int score = 0;
        int rollIndex = 0;
        for (int i = 0; i < 10; i++) {
            score += rolls[rollIndex] + rolls[rollIndex+1];
            rollIndex += 2;
        }
        return score;
    }

}

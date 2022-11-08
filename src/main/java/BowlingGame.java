public class BowlingGame {
    public static final int NUMBER_OF_FRAMES = 10;
    private final int[] rolls;

    public BowlingGame(int[] rolls) {
        this.rolls = rolls;
    }

    public int score() {
        int score = 0;
        int rollIndex = 0;
        for (int i = 0; i < NUMBER_OF_FRAMES; i++) {
            if (isSpare(rollIndex)) {
                score += rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
            } else {
                score += rolls[rollIndex] + rolls[rollIndex + 1];
            }
            rollIndex += 2;
        }
        return score;
    }

    private boolean isSpare(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
    }

}

public class BowlingGame {
    public static final int FRAMES = 10;
    private final int[] rolls;

    public BowlingGame(int[] rolls) {
        this.rolls = rolls;
    }

    public int totalScore() {
        int result = 0;
        int rollIndex = 0;
        for (int i = 0; i < FRAMES; i++) {
            if (isStrike(rollIndex)) {
                result += 10 + rolls[rollIndex + 1] + rolls[rollIndex + 2];
                rollIndex += 1;
            } else if (isSpare(rollIndex)) {
                result += 10 + rolls[rollIndex + 2];
                rollIndex += 2;
            } else {
                result += rolls[rollIndex] + rolls[rollIndex + 1];
                rollIndex += 2;
            }

        }
        return result;
    }

    private boolean isSpare(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
    }

    private boolean isStrike(int rollIndex) {
        return rolls[rollIndex] == 10;
    }
}

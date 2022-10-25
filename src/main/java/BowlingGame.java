public class BowlingGame {
    public static final int NUMBEROFFRAMES = 10;
    private final int[] rolls;

    public BowlingGame(int[] rolls) {
        this.rolls = rolls;
    }

    public int score() {
        int result = 0;
        int rollsIndex = 0;
        for (int frameIndex = 0; frameIndex < NUMBEROFFRAMES; frameIndex++) {
            if (isStrike(rollsIndex)){
                result += rolls[rollsIndex] + rolls[rollsIndex + 1] + rolls[rollsIndex + 2];
                rollsIndex += 1;
            }
            else if (isSpare(rollsIndex)){
                result += rolls[rollsIndex] + rolls[rollsIndex + 1] + rolls[rollsIndex + 2];
                rollsIndex += 2;
            } else {
                result += rolls[rollsIndex] + rolls[rollsIndex + 1];
                rollsIndex += 2;
            }
        }
        return result;
    }

    private boolean isStrike(int rollsIndex) {
        return rolls[rollsIndex] == 10;
    }

    private boolean isSpare(int rollsIndex) {

        return rolls[rollsIndex] + rolls[rollsIndex + 1] == 10;
    }
}

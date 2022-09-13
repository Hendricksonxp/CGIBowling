public class BowlingGame {
    public static final int NumberOfFrames = 10;
    private final int[] rolls;
    private int rollIndex = 0;

    public BowlingGame(int[] rolls) {
        this.rolls = rolls;
    }

    public int score() {
        int result = 0;
        for (int i = 0; i < NumberOfFrames; i++) {
            if (isStrike()){
                result += 10 + nextRoll() + nextNextRoll();
                rollIndex += 1;
            } else if(isSpare()) {
                result += 10 + nextNextRoll();
                rollIndex += 2;
            } else {
                result += rolls[rollIndex] + nextRoll();
                rollIndex += 2;
            }

        }
        return result;
    }

    private int nextNextRoll() {
        return rolls[rollIndex + 2];
    }

    private int nextRoll() {
        return rolls[rollIndex + 1];
    }

    private boolean isSpare() {
        return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
    }

    private boolean isStrike() {
        return rolls[rollIndex] == 10;
    }
}

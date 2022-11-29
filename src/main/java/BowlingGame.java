public class BowlingGame {
    private final int[] rolls;

    public BowlingGame(int[] rolls) {
        this.rolls = rolls;
    }

    public int totalScore() {
        int result = 0;
        for (int i = 0; i < rolls.length; i++) {
            result += rolls[i];
        }
        return result;
    }
}

public class BowlingGame {
    private final int[] rolls;

    public BowlingGame(int[] rolls) {
        this.rolls = rolls;
    }

    public int score() {
        int result = 0;
        for (int each:rolls) {
            result +=each;
        }
        return result;
    }
}

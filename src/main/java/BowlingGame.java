public class BowlingGame {
    private final int[] rolls;

    public BowlingGame(int[] rolls) {
        this.rolls = rolls;
    }

    public int score() {
        int result = 0;
        int rollIndex = 0;
        for (int i = 0; i < 10; i++) {
            if (rolls[rollIndex] == 10){
                result += rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
                rollIndex += 1;
            } else if(rolls[rollIndex] + rolls[rollIndex + 1] == 10) {
                result += rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
                rollIndex += 2;
            } else {
                result += rolls[rollIndex] + rolls[rollIndex + 1];
                rollIndex += 2;
            }

        }
        return result;
    }
}

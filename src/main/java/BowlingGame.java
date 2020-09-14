public class BowlingGame {
    public  int calcScore(int[] downCount) {
        int rollIndex = 0;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if(isSpare(downCount[rollIndex], downCount[rollIndex + 1])) {
                result += 10;
                result += downCount[rollIndex + 2];
            } else {
                result += downCount[rollIndex];
                result += downCount[rollIndex + 1];
            }
            rollIndex += 2;
        }
        return result;
    }

    private Boolean isSpare(int firstThrow, int secondThrow) {
        return firstThrow + secondThrow == 10;
    }
}

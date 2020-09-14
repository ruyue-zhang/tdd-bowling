public class BowlingGame {
    public  int calcScore(int[] downCount) {
        int rollIndex = 0;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if(isStrike(downCount[rollIndex])) {
                result += (10 + downCount[rollIndex + 1] +downCount[rollIndex + 2]);
                rollIndex++;
            } else if(isSpare(downCount[rollIndex], downCount[rollIndex + 1])) {
                result += (10 + downCount[rollIndex + 2]);
                rollIndex += 2;
            } else {
                result += (downCount[rollIndex] + downCount[rollIndex + 1]);
                rollIndex += 2;
            }
        }
        return result;
    }

    private Boolean isSpare(int firstThrow, int secondThrow) {
        return firstThrow + secondThrow == 10;
    }

    private Boolean isStrike(int firstThrow) {
        return firstThrow == 10;
    }
}

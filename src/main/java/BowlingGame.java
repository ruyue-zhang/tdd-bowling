public class BowlingGame {
    public  int calcScore(int[] downCount) {
        int result = 0;
        for (int i : downCount) {
            result += i;
        }
        return result;
    }
}

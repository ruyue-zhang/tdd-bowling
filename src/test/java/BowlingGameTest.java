import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_return_0_when_not_hit_any() {
        int[] downCount = new int[20];
        BowlingGame bowlingGame = new BowlingGame();
        int result = bowlingGame.calcScore(downCount);
        assertEquals(0, result);
    }
}

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

    @Test
    void should_sum_all_score_when_hit_twice_can_not_spare_every_frame() {
        int[] downCount = {2, 3, 4, 3, 4, 5, 1, 1, 3, 6, 0, 8, 3, 4, 8, 1, 2, 2, 3, 5};
        BowlingGame bowlingGame = new BowlingGame();
        int result = bowlingGame.calcScore(downCount);
        assertEquals(68, result);
    }

    @Test
    void should_involve_when_hit_twice_spare() {
        int[] downCount = {2, 3, 7, 3, 4, 5, 1, 1, 3, 6, 0, 8, 3, 4, 8, 1, 2, 2, 3, 5};
        BowlingGame bowlingGame = new BowlingGame();
        int result = bowlingGame.calcScore(downCount);
        assertEquals(75, result);
    }

    @Test
    void should_involve_when_hit_once_strike() {
        int[] downCount = {10, 7, 3, 4, 5, 1, 1, 3, 6, 0, 8, 3, 4, 8, 1, 2, 2, 3, 5};
        BowlingGame bowlingGame = new BowlingGame();
        int result = bowlingGame.calcScore(downCount);
        assertEquals(90, result);
    }
}

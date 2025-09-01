package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #682. Baseball Game")
public class P682_BaseballGameTest {
    @DisplayName("testCalPoints1")
    @Test
    public void testCalPoints1() {
        String[] ops = {"5", "2", "C", "D", "+"};
        int expected = 30;

        P682_BaseballGame solution = new P682_BaseballGame();
        assertEquals(expected, solution.calPoints(ops));
    }

    @DisplayName("testCalPoints2")
    @Test
    public void testCalPoints2() {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        int expected = 27;

        P682_BaseballGame solution = new P682_BaseballGame();
        assertEquals(expected, solution.calPoints(ops));
    }
}

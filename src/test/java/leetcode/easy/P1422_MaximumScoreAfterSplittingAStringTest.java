package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #1422. Maximum Score After Splitting a String")
public class P1422_MaximumScoreAfterSplittingAStringTest {
    @DisplayName("P1422_testMaxScore")
    @ParameterizedTest
    @CsvSource({
            "011101, 5",
            "00111, 5",
            "1111, 3",
            "00, 1",
    })
    public void testMaxScore(String s, int expected) {
        P1422_MaximumScoreAfterSplittingAString solution = new P1422_MaximumScoreAfterSplittingAString();
        assertEquals(expected, solution.maxScore(s));

    }
}

package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #657. Robot Return to Origin")
public class P657_RobotReturnToOriginTest {

    @DisplayName("testJudgeCircle")
    @ParameterizedTest
    @CsvSource({
            "UD, true",
            "LL, false",
    })
    public void testJudgeCircle(String moves, boolean expected) {
        P657_RobotReturnToOrigin solution = new P657_RobotReturnToOrigin();
        assertEquals(expected, solution.judgeCircle(moves));
    }
}

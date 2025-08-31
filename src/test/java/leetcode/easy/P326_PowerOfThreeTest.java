package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #326. Power of Three")
public class P326_PowerOfThreeTest {
    @DisplayName("P326_testIsPowerOfThree")
    @ParameterizedTest
    @CsvSource({
            "27, true",
            "0, false",
            "9, true",
            "1, true",
            "3, true",
            "-1, false",
            "-3, false",
            "-9, false",
            "-27, false",
    })
    public void testIsPowerOfThree(int input, boolean expected) {
        P326_PowerOfThree solution = new P326_PowerOfThree();
        assertEquals(expected, solution.isPowerOfThree(input));
    }
}

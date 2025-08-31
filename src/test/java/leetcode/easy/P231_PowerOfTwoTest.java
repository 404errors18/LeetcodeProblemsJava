package leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class P231_PowerOfTwoTest {
    @ParameterizedTest
    @CsvSource({
            "1, true",
            "16, true",
            "3, false",
    })
    public void testIsPowerOfTwo1(int input, boolean expected) {
        P231_PowerOfTwo solution = new P231_PowerOfTwo();
        assertEquals(expected, solution.isPowerOfTwo(input));
    }
}

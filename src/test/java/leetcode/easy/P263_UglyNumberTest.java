package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #263. Ugly Number")
public class P263_UglyNumberTest {
    @DisplayName("P263_testIsUgly")
    @ParameterizedTest
    @CsvSource({
            "6, true",
            "1, true",
            "225, true",
            "14, false",
            "37, false",
    })
    public void testIsUgly(int input, boolean expected) {
        P263_UglyNumber solution = new P263_UglyNumber();
        assertEquals(expected, solution.isUgly(input));

    }
}

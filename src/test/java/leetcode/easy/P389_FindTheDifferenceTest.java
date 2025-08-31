package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #389. Find the Difference")
public class P389_FindTheDifferenceTest {


    @DisplayName("testFindTheDifference")
    @ParameterizedTest
    @CsvSource({
            "abcd, abcde, e",
            ", y, y"
    })
    public void testFindTheDifference(String s, String t, char expected) {
        P389_FindTheDifference solution = new P389_FindTheDifference();
        assertEquals(expected, solution.findTheDifference(s == null ? "" : s, t));
    }
}

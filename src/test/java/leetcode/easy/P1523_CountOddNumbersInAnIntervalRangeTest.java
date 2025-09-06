package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #1523. Count Odd Numbers in an Interval Range")
public class P1523_CountOddNumbersInAnIntervalRangeTest {
    @DisplayName("testCountOdds")
    @ParameterizedTest
    @CsvSource({
            // "3,7,3",
            // "8,10,1",
            "21,22,1",
            // "21,21,1",
            // "22,22,0",
    })
    public void testCountOdds(int low, int high, int expected) {
        P1523_CountOddNumbersInAnIntervalRange solution = new P1523_CountOddNumbersInAnIntervalRange();
        assertEquals(expected, solution.countOdds(low, high));
    }
}

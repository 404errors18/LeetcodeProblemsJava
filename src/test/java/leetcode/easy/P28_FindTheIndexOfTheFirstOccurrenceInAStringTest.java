package leetcode.easy;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #28. Find the Index of the First Occurrence in a String")
public class P28_FindTheIndexOfTheFirstOccurrenceInAStringTest {
    @DisplayName("P28_testStrStr")
    @ParameterizedTest
    @CsvSource({
            "sadbutsad, sad, 0",
            "leetcode, leeto, -1",
    })
    public void testStrStr(String haystack, String needle, int expected) {
        P28_FindTheIndexOfTheFirstOccurrenceInAString solution = new P28_FindTheIndexOfTheFirstOccurrenceInAString();
        assertEquals(expected, solution.strStr(haystack, needle));
    }
}

package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #1768. Merge Strings Alternately")
public class P1768_MergeStringsAlternatelyTest {
    @DisplayName("testMergeAlternately")
    @ParameterizedTest
    @CsvSource({
            "abc, pqr, apbqcr",
            "ab, pqrs, apbqrs",
            "abcd, pq, apbqcd",
    })
    public void testMergeAlternately(String word1, String word2, String expected) {
        P1768_MergeStringsAlternately solution = new P1768_MergeStringsAlternately();
        assertEquals(expected, solution.mergeAlternately(word1, word2));

    }
}

package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #2586. Count the Number of Vowel Strings in Range")
public class P2586_CountTheNumberOfVowelStringsInRangeTest {

    @DisplayName("P2586_testVowelStrings1")
    @Test
    public void testVowelStrings1() {
        String[] words = {"are", "amy", "u"};
        int left = 0, right = 2;
        int expected = 2;

        P2586_CountTheNumberOfVowelStringsInRange solution = new P2586_CountTheNumberOfVowelStringsInRange();
        assertEquals(expected, solution.vowelStrings(words, left, right));
    }

    @DisplayName("P2586_testVowelStrings2")
    @Test
    public void testVowelStrings2() {
        String[] words = {"hey", "aeo", "mu", "ooo", "artro"};
        int left = 1, right = 4;
        int expected = 3;

        P2586_CountTheNumberOfVowelStringsInRange solution = new P2586_CountTheNumberOfVowelStringsInRange();
        assertEquals(expected, solution.vowelStrings(words, left, right));
    }
}

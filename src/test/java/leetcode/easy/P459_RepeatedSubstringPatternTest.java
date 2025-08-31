package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #459. Repeated Substring Pattern")
public class P459_RepeatedSubstringPatternTest {
    @DisplayName("testRepeatedSubstringPattern")
    @ParameterizedTest
    @CsvSource({
            "abab, true",
            "aba, false",
            "abcabcabcabc, true",
            "ababab, true",
            "aaa, true",
            "aaabbb, false",
            "a, false",
            "abaababaab, true",
    })
    public void testRepeatedSubstringPattern(String s, boolean expected) {
        P459_RepeatedSubstringPattern solution = new P459_RepeatedSubstringPattern();
        assertEquals(expected, solution.repeatedSubstringPattern(s));
    }
}

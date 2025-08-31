package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;



@DisplayName("Leetcode Problem #242. Valid Anagram")
public class P242_ValidAnagramTest {
    @DisplayName("P242_testIsAnagram")
    @ParameterizedTest
    @CsvSource({
            "anagram, nagaram, true",
            "rat, car, false",
            "ab, a, false",
    })
    public void testIsAnagram(String s, String t, boolean expected) {
        P242_ValidAnagram solution = new P242_ValidAnagram();
        assertEquals(expected, solution.isAnagram(s, t));
    }
}

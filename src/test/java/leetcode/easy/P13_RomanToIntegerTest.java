package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #13. Roman to Integer")
public class P13_RomanToIntegerTest {
    @DisplayName("testRomanToInt")
    @ParameterizedTest
    @CsvSource({
            "III, 3",
            "IV, 4",
            "IX, 9",
            "LVIII, 58",
            "MCMXCIV, 1994",
    })
    public void testRomanToInt(String s, int expected) {
        P13_RomanToInteger solution = new P13_RomanToInteger();
        assertEquals(expected, solution.romanToInt(s));
    }
}

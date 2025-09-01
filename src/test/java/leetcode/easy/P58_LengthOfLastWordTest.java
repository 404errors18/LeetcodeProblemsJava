package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #58. Length of Last Word")
public class P58_LengthOfLastWordTest {
    @DisplayName("testLengthOfLastWord")
    @ParameterizedTest
    @CsvSource({
            "Hello World, 5",
            "   fly me   to   the moon  , 4",
            "luffy is still joyboy, 6",
            " a, 1",
            "a, 1",
            "Today is a nice day, 3"
    })
    public void testLengthOfLastWord(String s, int expected) {
        P58_LengthOfLastWord solution = new P58_LengthOfLastWord();
        assertEquals(expected, solution.lengthOfLastWord(s));
    }
}

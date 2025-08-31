package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #709. To Lower Case")
public class P709_ToLowerCaseTest {
    @DisplayName("testToLowerCase")
    @ParameterizedTest
    @CsvSource({
            "Hello, hello",
            "here, here",
            "LOVELY, lovely",
    })
    public void testToLowerCase(String s, String expected) {
        P709_ToLowerCase solution = new P709_ToLowerCase();
        assertEquals(expected, solution.toLowerCase(s));
    }
}

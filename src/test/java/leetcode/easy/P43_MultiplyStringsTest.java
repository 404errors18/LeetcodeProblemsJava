package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #43. Multiply Strings")
public class P43_MultiplyStringsTest {

    @DisplayName("testMultiply")
    @ParameterizedTest
    @CsvSource({
            "2,3,6",
            "123,456,56088",
    })
    public void testMultiply(String num1, String num2, String expected) {
        P43_MultiplyStrings solution = new P43_MultiplyStrings();
        assertEquals(expected, solution.multiply(num1, num2));
    }
}

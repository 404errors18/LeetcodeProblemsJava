package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #67. Add Binary")
public class P67_AddBinaryTest {
    @DisplayName("testAddBinary")
    @ParameterizedTest
    @CsvSource({
            "11,1,100",
            "1010,1011,10101",
    })
    public void testAddBinary(String a, String b, String expected) {
        P67_AddBinary solution = new P67_AddBinary();
        assertEquals(expected, solution.addBinary(a, b));
    }

}

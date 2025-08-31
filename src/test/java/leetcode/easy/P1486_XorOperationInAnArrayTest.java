package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1486_XorOperationInAnArrayTest {
    @Test
    public void testXorOperationInAnArray1() {
        int n = 5, start = 0, expected = 8;
        P1486_XorOperationInAnArray solution = new P1486_XorOperationInAnArray();
        int result = solution.xorOperation(n, start);

        assertEquals(expected, result);
    }

    @Test
    public void testXorOperationInAnArray2() {
        int n = 4, start = 3, expected = 8;
        P1486_XorOperationInAnArray solution = new P1486_XorOperationInAnArray();
        int result = solution.xorOperation(n, start);

        assertEquals(expected, result);
    }

    @Test
    public void testXorOperationInAnArray3() {
        int n = 1, start = 7, expected = 7;
        P1486_XorOperationInAnArray solution = new P1486_XorOperationInAnArray();
        int result = solution.xorOperation(n, start);

        assertEquals(expected, result);
    }

    @Test
    public void testXorOperationInAnArray4() {
        int n = 10, start = 5, expected = 2;
        P1486_XorOperationInAnArray solution = new P1486_XorOperationInAnArray();
        int result = solution.xorOperation(n, start);

        assertEquals(expected, result);
    }
}

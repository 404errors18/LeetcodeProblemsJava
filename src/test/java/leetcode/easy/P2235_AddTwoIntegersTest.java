package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2235_AddTwoIntegersTest {
    @Test
    public void testAddTwoIntegers1() {
        P2235_AddTwoIntegers solution = new P2235_AddTwoIntegers();
        int result = solution.sum(12, 5);
        int answer = 17;
        assertEquals(answer, result);
    }

    @Test
    public void testAddTwoIntegers2() {
        P2235_AddTwoIntegers solution = new P2235_AddTwoIntegers();
        int result = solution.sum(-10, 4);
        int answer = -6;
        assertEquals(answer, result);
    }
}

package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2413_SmallestEvenMultipleTest {
    @Test
    public void testSmallestEvenMultiple1() {
        int n = 5;
        int expected = 10;
        int result = new P2413_SmallestEvenMultiple().smallestEvenMultiple(n);

        assertEquals(expected, result);
    }

    @Test
    public void testSmallestEvenMultiple2() {
        int n = 6;
        int expected = 6;
        int result = new P2413_SmallestEvenMultiple().smallestEvenMultiple(n);

        assertEquals(expected, result);
    }
}

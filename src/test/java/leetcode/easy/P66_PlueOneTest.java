package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Leetcode Problem #66. Plus One")
public class P66_PlueOneTest {
    @DisplayName("testPlusOne1")
    @Test
    public void testPlusOne1() {
        int[] digits = {1, 2, 3};
        int[] expected = {1, 2, 4};

        P66_PlueOne solution = new P66_PlueOne();
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @DisplayName("testPlusOne2")
    @Test
    public void testPlusOne2() {
        int[] digits = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};

        P66_PlueOne solution = new P66_PlueOne();
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @DisplayName("testPlusOne3")
    @Test
    public void testPlusOne3() {
        int[] digits = {9};
        int[] expected = {1, 0};

        P66_PlueOne solution = new P66_PlueOne();
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @DisplayName("testPlusOne4")
    @Test
    public void testPlusOne4() {
        int[] digits = {9, 9};
        int[] expected = {1, 0, 0};

        P66_PlueOne solution = new P66_PlueOne();
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @DisplayName("testPlusOne5")
    @Test
    public void testPlusOne5() {
        int[] digits = {9, 9, 9};
        int[] expected = {1, 0, 0, 0};

        P66_PlueOne solution = new P66_PlueOne();
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @DisplayName("testPlusOne6")
    @Test
    public void testPlusOne6() {
        int[] digits = {0};
        int[] expected = {1};

        P66_PlueOne solution = new P66_PlueOne();
        assertArrayEquals(expected, solution.plusOne(digits));
    }
}

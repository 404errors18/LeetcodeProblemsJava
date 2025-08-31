package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #1822. Sign of the Product of an Array")
public class P1822_SignOfTheProductOfAnArrayTest {
    @DisplayName("testArraySign1")
    @Test
    public void testArraySign1() {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        int expected = 1;

        P1822_SignOfTheProductOfAnArray solution = new P1822_SignOfTheProductOfAnArray();
        assertEquals(expected, solution.arraySign(nums));
    }

    @DisplayName("testArraySign2")
    @Test
    public void testArraySign2() {
        int[] nums = {1, 5, 0, 2, -3};
        int expected = 0;

        P1822_SignOfTheProductOfAnArray solution = new P1822_SignOfTheProductOfAnArray();
        assertEquals(expected, solution.arraySign(nums));
    }

    @DisplayName("testArraySign3")
    @Test
    public void testArraySign3() {
        int[] nums = {-1, 1, -1, 1, -1};
        int expected = -1;

        P1822_SignOfTheProductOfAnArray solution = new P1822_SignOfTheProductOfAnArray();
        assertEquals(expected, solution.arraySign(nums));
    }

    @DisplayName("testArraySign4")
    @Test
    public void testArraySign4() {
        int[] nums = {-5};
        int expected = -1;

        P1822_SignOfTheProductOfAnArray solution = new P1822_SignOfTheProductOfAnArray();
        assertEquals(expected, solution.arraySign(nums));
    }

    @DisplayName("testArraySign5")
    @Test
    public void testArraySign5() {
        int[] nums = {0};
        int expected = 0;

        P1822_SignOfTheProductOfAnArray solution = new P1822_SignOfTheProductOfAnArray();
        assertEquals(expected, solution.arraySign(nums));
    }

    @DisplayName("testArraySign6")
    @Test
    public void testArraySign6() {
        int[] nums = {5};
        int expected = 1;

        P1822_SignOfTheProductOfAnArray solution = new P1822_SignOfTheProductOfAnArray();
        assertEquals(expected, solution.arraySign(nums));
    }

    @DisplayName("testArraySign7")
    @Test
    public void testArraySign7() {
        int[] nums = {-41, -22, 22, -84, 9, -92, -97, 42, 40, 48, 71, 63, 29, 5, -66};
        int expected = 1;

        P1822_SignOfTheProductOfAnArray solution = new P1822_SignOfTheProductOfAnArray();
        assertEquals(expected, solution.arraySign(nums));
    }
}

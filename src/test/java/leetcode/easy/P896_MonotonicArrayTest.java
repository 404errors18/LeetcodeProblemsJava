package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #896. Monotonic Array")
public class P896_MonotonicArrayTest {

    @DisplayName("testIsMonotonic1")
    @Test
    public void testIsMonotonic1() {
        int[] nums = {1, 2, 2, 3};
        boolean expected = true;

        P896_MonotonicArray solution = new P896_MonotonicArray();
        assertEquals(expected, solution.isMonotonic(nums));
    }

    @DisplayName("testIsMonotonic2")
    @Test
    public void testIsMonotonic2() {
        int[] nums = {6, 5, 4, 4};
        boolean expected = true;

        P896_MonotonicArray solution = new P896_MonotonicArray();
        assertEquals(expected, solution.isMonotonic(nums));
    }

    @DisplayName("testIsMonotonic3")
    @Test
    public void testIsMonotonic3() {
        int[] nums = {1, 3, 2};
        boolean expected = false;

        P896_MonotonicArray solution = new P896_MonotonicArray();
        assertEquals(expected, solution.isMonotonic(nums));
    }

    @DisplayName("testIsMonotonic4")
    @Test
    public void testIsMonotonic4() {
        int[] nums = {1, 1, 2, 2};
        boolean expected = true;

        P896_MonotonicArray solution = new P896_MonotonicArray();
        assertEquals(expected, solution.isMonotonic(nums));
    }

    @DisplayName("testIsMonotonic5")
    @Test
    public void testIsMonotonic5() {
        int[] nums = {1, 1, 1, 1};
        boolean expected = true;

        P896_MonotonicArray solution = new P896_MonotonicArray();
        assertEquals(expected, solution.isMonotonic(nums));
    }

    @DisplayName("testIsMonotonic6")
    @Test
    public void testIsMonotonic6() {
        int[] nums = {1};
        boolean expected = true;

        P896_MonotonicArray solution = new P896_MonotonicArray();
        assertEquals(expected, solution.isMonotonic(nums));
    }
}

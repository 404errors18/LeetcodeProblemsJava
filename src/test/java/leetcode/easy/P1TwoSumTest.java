package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


@DisplayName("Leetcode Problem #1. Two Sum")
public class P1TwoSumTest {

    @DisplayName("testTwoSumCase1")
    @Test
    public void testTwoSumCase1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] excepted = {0, 1};

        P1_TwoSum solution = new P1_TwoSum();
        assertArrayEquals(excepted, solution.twoSum(nums, target));
    }

    @DisplayName("testTwoSumCase2")
    @Test
    public void testTwoSumCase2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};

        P1_TwoSum solution = new P1_TwoSum();
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @DisplayName("testTwoSumCase3")
    @Test
    public void testTwoSumCase3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};

        P1_TwoSum solution = new P1_TwoSum();
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}

package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1512_NumberOfGoodPairsTest {
    @Test
    public void testNumIdenticalPairs1() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;

        P1512_NumberOfGoodPairs solution = new P1512_NumberOfGoodPairs();
        int result = solution.numIdenticalPairs(nums);

        assertEquals(expected, result);
    }

    @Test
    public void testNumIdenticalPairs2() {
        int[] nums = {1, 1, 1, 1};
        int expected = 6;

        P1512_NumberOfGoodPairs solution = new P1512_NumberOfGoodPairs();
        int result = solution.numIdenticalPairs(nums);

        assertEquals(expected, result);
    }

    @Test
    public void testNumIdenticalPairs3() {
        int[] nums = {1, 2, 3};
        int expected = 0;

        P1512_NumberOfGoodPairs solution = new P1512_NumberOfGoodPairs();
        int result = solution.numIdenticalPairs(nums);

        assertEquals(expected, result);
    }
}

package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Leetcode Problem #1470. Shuffle the Array")
public class P1470_ShuffleTheArrayTest {
    @DisplayName("P1470_Shuffle1")
    @Test
    public void testShuffle1() {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] expected = {2, 3, 5, 4, 1, 7};

        P1470_ShuffleTheArray solution = new P1470_ShuffleTheArray();
        assertArrayEquals(expected, solution.shuffle(nums, n));
    }

    @DisplayName("P1470_Shuffle2")
    @Test
    public void testShuffle2() {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] expected = {1, 4, 2, 3, 3, 2, 4, 1};

        P1470_ShuffleTheArray solution = new P1470_ShuffleTheArray();
        assertArrayEquals(expected, solution.shuffle(nums, n));
    }

    @DisplayName("P1470_Shuffle3")
    @Test
    public void testShuffle3() {
        int[] nums = {1, 1, 2, 2};
        int n = 2;
        int[] expected = {1, 2, 1, 2};

        P1470_ShuffleTheArray solution = new P1470_ShuffleTheArray();
        assertArrayEquals(expected, solution.shuffle(nums, n));
    }
}

package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Leetcode Problem #283. Move Zeroes")
public class P283_MoveZeroesTest {

    @DisplayName("testMoveZeroes1")
    @Test
    public void testMoveZeroes1() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        P283_MoveZeroes solution = new P283_MoveZeroes();
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @DisplayName("testMoveZeroes2")
    @Test
    public void testMoveZeroes2() {
        int[] nums = {0};
        int[] expected = {0};

        P283_MoveZeroes solution = new P283_MoveZeroes();
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @DisplayName("testMoveZeroes3")
    @Test
    public void testMoveZeroes3() {
        int[] nums = {0, 0};
        int[] expected = {0, 0};

        P283_MoveZeroes solution = new P283_MoveZeroes();
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @DisplayName("testMoveZeroes4")
    @Test
    public void testMoveZeroes4() {
        int[] nums = {1, 2};
        int[] expected = {1, 2};

        P283_MoveZeroes solution = new P283_MoveZeroes();
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @DisplayName("testMoveZeroes5")
    @Test
    public void testMoveZeroes5() {
        int[] nums = {1, 0};
        int[] expected = {1, 0};

        P283_MoveZeroes solution = new P283_MoveZeroes();
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @DisplayName("testMoveZeroes6")
    @Test
    public void testMoveZeroes6() {
        int[] nums = {1, 0, 1};
        int[] expected = {1, 1, 0};

        P283_MoveZeroes solution = new P283_MoveZeroes();
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }
}

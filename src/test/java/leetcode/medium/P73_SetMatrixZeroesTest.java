package leetcode.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Leetcode Problem #73. Set Matrix Zeroes")
public class P73_SetMatrixZeroesTest {

    @DisplayName("testSetZeroes1")
    @Test
    public void testSetZeroes1() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};

        P73_SetMatrixZeroes solution = new P73_SetMatrixZeroes();
        solution.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @DisplayName("testSetZeroes2")
    @Test
    public void testSetZeroes2() {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] expected = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};

        P73_SetMatrixZeroes solution = new P73_SetMatrixZeroes();
        solution.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }
}

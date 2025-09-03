package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #1572. Matrix Diagonal Sum")
public class P1572_MatrixDiagonalSumTest {
    @DisplayName("testDiagonalSum1")
    @Test
    public void testDiagonalSum1() {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int expected = 25;

        P1572_MatrixDiagonalSum solution = new P1572_MatrixDiagonalSum();
        assertEquals(expected, solution.diagonalSum(mat));
    }

    @DisplayName("testDiagonalSum2")
    @Test
    public void testDiagonalSum2() {
        int[][] mat = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
        };
        int expected = 8;

        P1572_MatrixDiagonalSum solution = new P1572_MatrixDiagonalSum();
        assertEquals(expected, solution.diagonalSum(mat));
    }

    @DisplayName("testDiagonalSum3")
    @Test
    public void testDiagonalSum3() {
        int[][] mat = {{5}};
        int expected = 5;

        P1572_MatrixDiagonalSum solution = new P1572_MatrixDiagonalSum();
        assertEquals(expected, solution.diagonalSum(mat));
    }
}

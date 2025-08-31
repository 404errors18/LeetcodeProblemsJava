package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Leetcode Problem #867. Transpose Matrix")
public class P867_TransposeMatrixTest {

    @DisplayName("testTranspose1")
    @Test
    public void testTranspose1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};

        P867_TransposeMatrix solution = new P867_TransposeMatrix();

        assertArrayEquals(expected, solution.transpose(matrix));
    }

    @DisplayName("testTranspose2")
    @Test
    public void testTranspose2() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{1, 4}, {2, 5}, {3, 6}};

        P867_TransposeMatrix solution = new P867_TransposeMatrix();

        assertArrayEquals(expected, solution.transpose(matrix));
    }

}

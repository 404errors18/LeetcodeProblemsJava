package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Leetcode Problem #54. Spiral Matrix")
public class P54_SpiralMatrixTest {
    @DisplayName("testSpiralOrder1")
    @Test
    public void testSpiralOrder1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);

        P54_SpiralMatrix solution = new P54_SpiralMatrix();
        assertArrayEquals(expected.toArray(), solution.spiralOrder(matrix).toArray());
    }

    @DisplayName("testSpiralOrder2")
    @Test
    public void testSpiralOrder2() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);

        P54_SpiralMatrix solution = new P54_SpiralMatrix();
        assertArrayEquals(expected.toArray(), solution.spiralOrder(matrix).toArray());
    }
}

package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #976. Largest Perimeter Triangle")
public class P976_LargestPerimeterTriangleTest {
    @DisplayName("testLargestPerimeter1")
    @Test
    public void testLargestPerimeter1() {
        int[] nums = {2, 1, 2};
        int expected = 5;

        P976_LargestPerimeterTriangle solution = new P976_LargestPerimeterTriangle();
        assertEquals(expected, solution.largestPerimeter(nums));
    }

    @DisplayName("testLargestPerimeter2")
    @Test
    public void testLargestPerimeter2() {
        int[] nums = {1, 2, 1, 10};
        int expected = 0;

        P976_LargestPerimeterTriangle solution = new P976_LargestPerimeterTriangle();
        assertEquals(expected, solution.largestPerimeter(nums));
    }

    @DisplayName("testLargestPerimeter3")
    @Test
    public void testLargestPerimeter3() {
        int[] nums = {3,6,2,3};
        int expected = 8;

        P976_LargestPerimeterTriangle solution = new P976_LargestPerimeterTriangle();
        assertEquals(expected, solution.largestPerimeter(nums));
    }
}

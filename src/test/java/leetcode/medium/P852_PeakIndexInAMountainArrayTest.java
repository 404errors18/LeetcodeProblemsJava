package leetcode.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #852. Peak Index in a Mountain Array")
public class P852_PeakIndexInAMountainArrayTest {
    @DisplayName("P852_testPeakIndexInAMountainArray1")
    @Test
    public void testPeakIndexInMountainArray1() {
        int[] arr = {0, 1, 0};
        int expected = 1;

        P852_PeakIndexInAMountainArray solution = new P852_PeakIndexInAMountainArray();
        assertEquals(expected, solution.peakIndexInMountainArray(arr));
    }

    @DisplayName("P852_testPeakIndexInAMountainArray2")
    @Test
    public void testPeakIndexInMountainArray2() {
        int[] arr = {0, 2, 1, 0};
        int expected = 1;

        P852_PeakIndexInAMountainArray solution = new P852_PeakIndexInAMountainArray();
        assertEquals(expected, solution.peakIndexInMountainArray(arr));
    }

    @DisplayName("P852_testPeakIndexInAMountainArray3")
    @Test
    public void testPeakIndexInMountainArray3() {
        int[] arr = {0, 10, 5, 2};
        int expected = 1;

        P852_PeakIndexInAMountainArray solution = new P852_PeakIndexInAMountainArray();
        assertEquals(expected, solution.peakIndexInMountainArray(arr));
    }

    @DisplayName("P852_testPeakIndexInAMountainArray4")
    @Test
    public void testPeakIndexInMountainArray4() {
        int[] arr = {3, 5, 3, 2, 0};
        int expected = 1;

        P852_PeakIndexInAMountainArray solution = new P852_PeakIndexInAMountainArray();
        assertEquals(expected, solution.peakIndexInMountainArray(arr));
    }

}

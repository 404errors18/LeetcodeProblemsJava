package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1534_CountGoodTripletsTest {
    @Test
    public void testCountGoodTriplets1() {
        int[] arr = {3, 0, 1, 1, 9, 7};
        int a = 7, b = 2, c = 3;
        int expected = 4;

        P1534_CountGoodTriplets solution = new P1534_CountGoodTriplets();
        int result = solution.countGoodTriplets(arr, a, b, c);

        assertEquals(expected, result);
    }

    @Test
    public void testCountGoodTriplets2() {
        int[] arr = {1, 1, 2, 2, 3};
        int a = 0, b = 0, c = 1;
        int expected = 0;

        P1534_CountGoodTriplets solution = new P1534_CountGoodTriplets();
        int result = solution.countGoodTriplets(arr, a, b, c);

        assertEquals(expected, result);
    }
}

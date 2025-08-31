package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P2469_ConvertTheTemperatureTest {
    @Test
    public void testConvertTheTemperature1() {
        P2469_ConvertTheTemperature solution = new P2469_ConvertTheTemperature();
        double[] result = solution.convertTemperature(36.50);
        double[] expected = {309.65000, 97.70000};

        assertArrayEquals(expected, result, 0.00001);
    }

    @Test
    public void testConvertTheTemperature2() {
        P2469_ConvertTheTemperature solution = new P2469_ConvertTheTemperature();
        double[] result = solution.convertTemperature(122.11);
        double[] expected = {395.26000, 251.79800};
        assertArrayEquals(expected, result, 0.00001);
    }
}

package leetcode.easy;

public class P2469_ConvertTheTemperature {
    /**
     *
     * @param celsius
     * @return [kelvin, fahrenheit]
     * @link https://leetcode.cn/problems/smallest-even-multiple/description/
     * @since 2025/07/14
     * @author Jaxien
     */
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.8 + 32.00};
    }
}

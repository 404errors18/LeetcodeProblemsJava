package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #1491. Average Salary Excluding the Minimum and Maximum Salary")
public class P1491_AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {

    @DisplayName("testAverage1")
    @Test
    public void testAverage1() {
        int[] salary = {4000, 3000, 1000, 2000};
        double expected = 2500.00000;

        P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary solution = new P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary();
        assertEquals(expected, solution.average(salary));
    }

    @DisplayName("testAverage2")
    @Test
    public void testAverage2() {
        int[] salary = {1000, 2000, 3000};
        double expected = 2000.00000;

        P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary solution = new P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary();
        assertEquals(expected, solution.average(salary));
    }

    @DisplayName("testAverage3")
    @Test
    public void testAverage3() {
        int[] salary = {6000, 5000, 4000, 3000, 2000, 1000};
        double expected = 3500.00000;

        P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary solution = new P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary();
        assertEquals(expected, solution.average(salary));
    }

    @DisplayName("testAverage4")
    @Test
    public void testAverage4() {
        int[] salary = {8000, 9000, 2000, 3000, 6000, 1000};
        double expected = 4750.00000;

        P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary solution = new P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary();
        assertEquals(expected, solution.average(salary));
    }
}

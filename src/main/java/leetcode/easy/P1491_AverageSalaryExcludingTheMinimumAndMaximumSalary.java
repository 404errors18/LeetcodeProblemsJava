package leetcode.easy;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average1(int[] salary) {
        int minSalary = salary[0];
        int maxSalary = salary[0];
        int sumSalary = 0;
        for (int sal : salary) {
            sumSalary += sal;
            minSalary = Math.min(minSalary, sal);
            maxSalary = Math.max(maxSalary, sal);
        }
        return (sumSalary - minSalary - maxSalary) / (salary.length - 2.0);
    }

    public double average2(int[] salary) {
        Arrays.sort(salary);
        int sumSalary = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sumSalary += salary[i];
        }
        return sumSalary / (salary.length - 2.0);
    }

    public double average(int[] salary) {
        IntSummaryStatistics stats = Arrays.stream(salary).summaryStatistics();
        return (stats.getSum() - stats.getMax() - stats.getMin()) / (salary.length - 2.0);
    }
}

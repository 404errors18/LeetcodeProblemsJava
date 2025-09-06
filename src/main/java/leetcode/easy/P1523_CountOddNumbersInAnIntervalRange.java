package leetcode.easy;

public class P1523_CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        return preOdds(high) - preOdds(low - 1);
    }

    private int preOdds(int num) {
        return (num + 1) >> 1;
    }
}

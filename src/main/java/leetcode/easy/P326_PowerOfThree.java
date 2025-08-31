package leetcode.easy;

public class P326_PowerOfThree {
    public boolean isPowerOfThree(int n) {
        while (n > 1) {
            n = n % 3 == 0 ? n / 3 : -1;
        }
        return n == 1;
    }
}

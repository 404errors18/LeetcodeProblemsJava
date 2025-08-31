package leetcode.easy;

public class P263_UglyNumber {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        for (int num : new int[]{2, 3, 5}) {
            while (n % num == 0) {
                n /= num;
            }
        }
        return n == 1;
    }
}

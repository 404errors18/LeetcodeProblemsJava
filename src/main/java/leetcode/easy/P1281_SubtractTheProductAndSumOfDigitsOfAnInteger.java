package leetcode.easy;

public class P1281_SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        String s = String.valueOf(n);
        for (char c : s.toCharArray()) {
            product *= c - '0';
            sum += c - '0';
        }
        return product - sum;
    }
}

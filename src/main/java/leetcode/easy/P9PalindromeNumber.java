package leetcode.easy;

public class P9PalindromeNumber {
    public boolean isPalindrome(int x) {
        // return isPalindromeSolution1(x);
        return isPalindromeSolution2(x);
    }

    public boolean isPalindromeSolution1(int x) {
        String xStr = String.valueOf(x);
        return new StringBuffer(xStr).reverse().toString().equals(xStr);
    }

    public boolean isPalindromeSolution2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed_x = 0;
        while (reversed_x < x) {
            reversed_x = reversed_x * 10 + x % 10;
            x = x / 10;
        }
        return x == reversed_x || x == reversed_x / 10;
    }
}

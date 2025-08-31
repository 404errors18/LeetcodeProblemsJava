package leetcode.easy;

import java.util.Arrays;

public class P66_PlueOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] > 9) {
                digits[i] = 0;
            } else {
                break;
            }
        }
        if (0 < digits[0] && digits[0] < 10) {
            return digits;
        }
        int[] result = Arrays.copyOf(digits, digits.length + 1);
        result[0] = 1;
        return result;
    }
}

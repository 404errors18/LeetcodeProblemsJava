package leetcode.easy;

public class P1822_SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int result = 1;
        for (int num : nums) {
            result = num >= 0 ? (num > 0 ? result : 0) : -result;
            if (result == 0) {
                break;
            }
        }
        return result;
    }
}

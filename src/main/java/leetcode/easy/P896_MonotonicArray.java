package leetcode.easy;

public class P896_MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int diff = nums[1] - nums[0];
        int type = diff >= 0 ? (diff > 0 ? 1 : 0) : -1;
        for (int i = 2; i < nums.length; i++) {
            diff = nums[i] - nums[i - 1];
            int nowType = diff >= 0 ? (diff > 0 ? 1 : type) : -1;
            if (type != nowType) {
                if (type == 0) {
                    type = nowType;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}

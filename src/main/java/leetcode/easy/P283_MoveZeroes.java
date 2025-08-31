package leetcode.easy;

public class P283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroPtr = 0;
        int numPtr = 0;
        while (numPtr < nums.length - 1) {
            while (zeroPtr < nums.length && nums[zeroPtr] != 0) {
                zeroPtr++;
            }
            numPtr = zeroPtr + 1;
            while (numPtr < nums.length && nums[numPtr] == 0) {
                numPtr++;
            }
            if (zeroPtr >= nums.length || numPtr >= nums.length) {
                return;
            }

            nums[zeroPtr] = nums[numPtr];
            nums[numPtr] = 0;
        }
    }
}

package leetcode.easy;

public class P1470_ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int x = 0;
        int y = n;
        int i = 0;
        while (i < nums.length) {
            result[i] = nums[x++];
            result[++i] = nums[y++];
            i++;

        }

        return result;
    }
}

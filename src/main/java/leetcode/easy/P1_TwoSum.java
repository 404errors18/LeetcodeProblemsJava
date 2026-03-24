package leetcode.easy;

import java.util.*;
import java.util.stream.Collectors;

public class P1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // return twoSumSolution1(nums, target);
        return twoSumSolution2(nums, target);
    }

    public int[] twoSumSolution1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSumSolution2(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numToIndex.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement) && numToIndex.get(complement) != i) {
                return new int[]{i, numToIndex.get(complement)};
            }
        }
        return null;
    }

}

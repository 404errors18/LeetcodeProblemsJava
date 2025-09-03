package leetcode.easy;

import java.util.Arrays;

public class P1672_RichestCustomerWealth {
    public int maximumWealth1(int[][] accounts) {
        int result = 0;
        for (int[] account : accounts) {
            result = Math.max(result, Arrays.stream(account).sum());
        }
        return result;
    }

    public int maximumWealth2(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(account -> Arrays.stream(account).sum()).max().orElse(0);
    }

    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int money : account) {
                sum += money;
            }
            result = Math.max(result, sum);
        }
        return result;
    }
}

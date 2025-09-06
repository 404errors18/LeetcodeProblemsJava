package leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class P860_LemonadeChange {
    private static final int LEMONADE = 5;
    private static final int DENOMINATION_5 = 5;
    private static final int DENOMINATION_10 = 10;
    private static final int DENOMINATION_20 = 20;

    private Map<Integer, Integer> checkoutCounterMap = new HashMap<>(3);

    public boolean lemonadeChange(int[] bills) {
        for (int bill : bills) {
            if (!isCanChange(bill - LEMONADE)) {
                return false;
            }
            cashier(bill);
        }
        return true;
    }

    private void cashier(int money) {
        checkoutCounterMap.put(money, checkoutCounterMap.getOrDefault(money, 0) + 1);
    }

    private boolean isCanChange(int changeMoney) {
        int twentyCount = 0;
        int tenCount = 0;
        int fiveCount = 0;
        Integer[] denomination_arr = {DENOMINATION_20, DENOMINATION_10, DENOMINATION_5};
        // Arrays.sort(denomination_arr, Comparator.reverseOrder());
        for (int denomination : denomination_arr) {
            if (changeMoney >= denomination && checkoutCounterMap.getOrDefault(denomination, 0) != 0) {
                int count = Math.min(changeMoney / denomination, checkoutCounterMap.get(denomination));
                changeMoney -= count * denomination;
                switch (denomination) {
                    case DENOMINATION_20:
                        twentyCount = count;
                        break;
                    case DENOMINATION_10:
                        tenCount = count;
                        break;
                    case DENOMINATION_5:
                        fiveCount = count;
                        break;
                }
            }
        }
        if (changeMoney == 0) {
            checkoutCounterMap.put(DENOMINATION_20, checkoutCounterMap.getOrDefault(DENOMINATION_20, 0) - twentyCount);
            checkoutCounterMap.put(DENOMINATION_10, checkoutCounterMap.getOrDefault(DENOMINATION_10, 0) - tenCount);
            checkoutCounterMap.put(DENOMINATION_5, checkoutCounterMap.getOrDefault(DENOMINATION_5, 0) - fiveCount);
            return true;
        }
        return false;
    }
}

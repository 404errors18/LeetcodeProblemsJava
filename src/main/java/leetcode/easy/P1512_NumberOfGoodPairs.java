package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1512. 好数对的数目
 *
 * @author Jaxien
 * @link <a href="https://leetcode.cn/problems/number-of-good-pairs/description/">1512. 好数对的数目</a>
 * @since 2025-07-16
 */
public class P1512_NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count += entry.getValue() * (entry.getValue() - 1) >> 1;
        }

        return count;
    }
}
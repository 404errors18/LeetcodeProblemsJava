package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class P13_RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);
        int result = map.get(s.charAt(s.length() - 1));
        for (int i = 0; i < s.length() - 1; i++) {
            int a = map.get(s.charAt(i));
            int b = map.get(s.charAt(i + 1));
            if (a < b) {
                result -= a;
            } else {
                result += a;
            }
        }
        return result;
    }
}

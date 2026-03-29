package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class P13_RomanToInteger {
    public int romanToInt(String s) {
        // return romanToIntSolution1(s);
        return romanToIntSolution2(s);
    }

    public int romanToIntSolution1(String s) {
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


    public int romanToIntSolution2(String s) {
        Map<Character, Integer> charToInt = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int result = 0;
        int i = 0;
        int j = 1;
        while (j < s.length()) {
            int iToInt = charToInt.get(s.charAt(i));
            int jToInt = charToInt.get(s.charAt(j));
            if (iToInt >= jToInt) {
                result += iToInt;
                i++;
                j++;
            } else {
                result += -iToInt + jToInt;
                i += 2;
                j += 2;
            }
        }
        if (i == s.length() - 1) {
            result += charToInt.get(s.charAt(i));
        }
        return result;
    }
}

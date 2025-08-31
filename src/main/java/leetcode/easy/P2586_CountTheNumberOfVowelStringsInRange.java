package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class P2586_CountTheNumberOfVowelStringsInRange {
    public int vowelStrings1(String[] words, int left, int right) {
        int count = 0;
        String vowels = "aeiou";
        for (int i = left; i <= right; i++) {
            if (vowels.contains(String.valueOf(words[i].charAt(0))) &&
                    vowels.contains(String.valueOf(words[i].charAt(words[i].length() - 1)))) {
                count++;
            }
        }
        return count;
    }

    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : "aeiou".toCharArray()) {
            map.put(ch, 1);
        }

        for (int i = left; i <= right; i++) {
            count += map.getOrDefault(words[i].charAt(0), 0) &
                    map.getOrDefault(words[i].charAt(words[i].length() - 1), 0);
        }
        return count;
    }
}

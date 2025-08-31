package leetcode.easy;

import java.util.Arrays;

public class P1768_MergeStringsAlternately {
    public String mergeAlternately1(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        char[] result = new char[word1.length() + word2.length()];
        int i = 0, j = 0;
        while (i < Math.min(word1.length(), word2.length())) {
            result[j++] = chars1[i];
            result[j++] = chars2[i++];
        }
        while (i < Math.max(word1.length(), word2.length())) {
            if (word1.length() < word2.length()) {
                result[j++] = chars2[i++];
            } else {
                result[j++] = chars1[i++];
            }
        }
        return new String(result);
    }

    public String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        StringBuilder result = new StringBuilder(word1Length + word2Length);

        for (int i = 0; i < Math.max(word1Length, word2Length); i++) {
            if (i < word1Length) {
                result.append(word1.charAt(i));
            }
            if (i < word2Length) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}

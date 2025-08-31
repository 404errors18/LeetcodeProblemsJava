package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class P459_RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern1(String s) {
        String s1 = s + s;
        return s1.substring(1, s1.length() - 1).contains(s);
    }

    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder(s + s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        return sb.indexOf(s) != -1;
    }
}

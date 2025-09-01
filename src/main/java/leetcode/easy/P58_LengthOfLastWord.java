package leetcode.easy;

public class P58_LengthOfLastWord {
    public int lengthOfLastWord1(String s) {
        String[] words = s.split(" ");
        return s.split(" ")[words.length - 1].length();
    }

    public int lengthOfLastWord(String s) {
        s = s.stripTrailing();
        return s.length() - s.lastIndexOf(" ") - 1;
    }

}

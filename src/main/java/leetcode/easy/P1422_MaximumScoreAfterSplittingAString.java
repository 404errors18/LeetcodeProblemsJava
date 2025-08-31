package leetcode.easy;

public class P1422_MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        int leftScore = s.charAt(0) == '0' ? 1 : 0;
        int rightScore = (int) s.substring(1).chars().filter(ch -> ch == '1').count();
        int maxScore = leftScore + rightScore;

        for (int i = 1; i < s.length() - 1; i++) {
            leftScore += s.charAt(i) == '0' ? 1 : 0;
            rightScore -= s.charAt(i) == '1' ? 1 : 0;
            maxScore = Math.max(maxScore, leftScore + rightScore);
        }
        return maxScore;
    }
}

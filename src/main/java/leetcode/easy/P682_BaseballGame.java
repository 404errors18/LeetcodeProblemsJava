package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class P682_BaseballGame {
    public int calPoints(String[] operations) {
        List<Integer> scores = new ArrayList<>();
        for (String s : operations) {
            switch (s) {
                case "+":
                    scores.add(scores.getLast() + scores.get(scores.size() - 2));
                    break;
                case "D":
                    scores.add(scores.getLast() * 2);
                    break;
                case "C":
                    scores.removeLast();
                    break;
                default:
                    scores.add(Integer.parseInt(s));
                    break;
            }
        }
        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}

package leetcode.easy;

import java.util.Arrays;

public class P657_RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int[] pos = {0, 0};
        for (char ch : moves.toCharArray()) {
            switch (ch) {
                case 'R':
                    pos[0]++;
                    break;
                case 'L':
                    pos[0]--;
                    break;
                case 'U':
                    pos[1]++;
                    break;
                case 'D':
                    pos[1]--;
                    break;
            }
        }
        return Arrays.equals(new int[]{0, 0}, pos);
    }
}

package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class P73_SetMatrixZeroes {
    private static final int TARGET_NUM = 0;

    public void setZeroes(int[][] matrix) {
        Set<int[]> setZeroPosSet = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == TARGET_NUM) {
                    calculateZeroPos(matrix, setZeroPosSet, new int[]{i, j});
                }
            }
        }

        for (int[] pos : setZeroPosSet) {
            int i = pos[0];
            int j = pos[1];
            matrix[i][j] = TARGET_NUM;
        }
    }

    private void calculateZeroPos(int[][] matrix, Set<int[]> setZeroPosSet, int[] pos) {
        for (int i = 0; i < matrix.length; i++) {
            setZeroPosSet.add(new int[]{i, pos[1]});
        }
        for (int j = 0; j < matrix[0].length; j++) {
            setZeroPosSet.add(new int[]{pos[0], j});
        }
    }
}

package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// public class P54_SpiralMatrix {
//     private static final int INVALID_FLAG = -404;
//     private static final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};  // 右下左上
//
//     public List<Integer> spiralOrder(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         List<Integer> result = new ArrayList<>(m * n);
//
//         int i = 0, j = 0;
//         int dir = 0;
//         for (int step = 0; step < m * n; step++) {
//             result.add(matrix[i][j]);
//             matrix[i][j] = INVALID_FLAG;
//             int nextI = i + DIRS[dir][0];
//             int nextJ = j + DIRS[dir][1];
//             if (nextI < 0 || nextI >= m || nextJ < 0 || nextJ >= n || matrix[nextI][nextJ] == INVALID_FLAG) {
//                 dir = (dir + 1) % DIRS.length;
//             }
//             i += DIRS[dir][0];
//             j += DIRS[dir][1];
//         }
//         return result;
//     }
// }

public class P54_SpiralMatrix {
    private static final int VISITED_MARKER = Integer.MAX_VALUE;

    private static final int[][] DIRECTIONS = {
            {0, 1},  // right
            {1, 0},  // down
            {0, -1},  // left
            {-1, 0}  // up
    };

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Collections.emptyList();
        }

        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>(m * n);

        int i = 0, j = 0;
        int dir = 0;

        for (int step = 0; step < m * n; step++) {
            result.add(matrix[i][j]);
            matrix[i][j] = VISITED_MARKER;

            int nextI = i + DIRECTIONS[dir][0];
            int nextJ = j + DIRECTIONS[dir][1];

            if (isOutOfBounds(nextI, nextJ, m, n) || matrix[nextI][nextJ] == VISITED_MARKER) {
                dir = (dir + 1) % DIRECTIONS.length;
            }
            i += DIRECTIONS[dir][0];
            j += DIRECTIONS[dir][1];
        }
        return result;
    }

    private boolean isOutOfBounds(int i, int j, int m, int n) {
        return i < 0 || i >= m || j < 0 || j >= n;
    }
}

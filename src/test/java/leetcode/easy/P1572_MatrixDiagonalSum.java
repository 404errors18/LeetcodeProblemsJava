package leetcode.easy;

public class P1572_MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int left = 0;
        int right = mat[0].length - 1;

        int result_sum = 0;
        for (int[] row : mat) {
            result_sum += row[left++] + row[right--];
        }
        return mat.length % 2 == 0 ? result_sum : (result_sum - mat[mat.length / 2][mat.length / 2]);
    }
}

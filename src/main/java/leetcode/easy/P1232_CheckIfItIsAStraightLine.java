package leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class P1232_CheckIfItIsAStraightLine {
    // public boolean checkStraightLine(int[][] coordinates) {
    //     Arrays.sort(coordinates, Comparator
    //             .comparingInt((int[] a) -> a[0])
    //             .thenComparingInt((int[] a) -> a[1])
    //     );
    //
    //     int dx = coordinates[0][0] - coordinates[1][0];
    //     int dy = coordinates[0][1] - coordinates[1][1];
    //
    //     for (int i = 1; i < coordinates.length - 1; i++) {
    //         int dx_ = coordinates[i][0] - coordinates[i + 1][0];
    //         int dy_ = coordinates[i][1] - coordinates[i + 1][1];
    //
    //         if (dx != dx_ || dy != dy_) {
    //             return false;
    //         }
    //     }
    //
    //     return true;
    // }

    public boolean checkStraightLine(int[][] coordinates) {
        int dx = coordinates[0][0] - coordinates[1][0];
        int dy = coordinates[0][1] - coordinates[1][1];
        double k = dx != 0 ? (double) dy / dx : Double.MAX_VALUE;

        for (int i = 1; i < coordinates.length - 1; i++) {
            int dx_ = coordinates[i][0] - coordinates[i + 1][0];
            int dy_ = coordinates[i][1] - coordinates[i + 1][1];
            double k_ = dx_ != 0 ? (double) dy_ / dx_ : Double.MAX_VALUE;

            if (Math.abs(k - k_) > 0.0000001) {
                return false;
            }
        }

        return true;
    }
}

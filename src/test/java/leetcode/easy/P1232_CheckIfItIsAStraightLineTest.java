package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Leetcode Problem #1232. Check If It Is a Straight Line")
public class P1232_CheckIfItIsAStraightLineTest {
    @DisplayName("testCheckStraightLine1")
    @Test
    public void testCheckStraightLine1() {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};

        P1232_CheckIfItIsAStraightLine solution = new P1232_CheckIfItIsAStraightLine();
        assertTrue(solution.checkStraightLine(coordinates));
    }

    @DisplayName("testCheckStraightLine2")
    @Test
    public void testCheckStraightLine2() {
        int[][] coordinates = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};

        P1232_CheckIfItIsAStraightLine solution = new P1232_CheckIfItIsAStraightLine();
        assertFalse(solution.checkStraightLine(coordinates));
    }

    @DisplayName("testCheckStraightLine3")
    @Test
    public void testCheckStraightLine3() {
        int[][] coordinates = {{0, 0}, {0, 1}, {0, -1}};

        P1232_CheckIfItIsAStraightLine solution = new P1232_CheckIfItIsAStraightLine();
        assertTrue(solution.checkStraightLine(coordinates));
    }

    @DisplayName("testCheckStraightLine4")
    @Test
    public void testCheckStraightLine4() {
        int[][] coordinates = {{2, 4}, {2, 5}, {2, 8}};

        P1232_CheckIfItIsAStraightLine solution = new P1232_CheckIfItIsAStraightLine();
        assertTrue(solution.checkStraightLine(coordinates));
    }

    @DisplayName("testCheckStraightLine5")
    @Test
    public void testCheckStraightLine5() {
        int[][] coordinates = {{-3, -2}, {-1, -2}, {2, -2}, {-2, -2}, {0, -2}};

        P1232_CheckIfItIsAStraightLine solution = new P1232_CheckIfItIsAStraightLine();
        assertTrue(solution.checkStraightLine(coordinates));
    }
}

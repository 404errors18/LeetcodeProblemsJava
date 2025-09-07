package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #1275. Find Winner on a Tic Tac Toe Game")
public class P1275_FindWinnerOnATicTacToeGameTest {
    @DisplayName("testTictactoe1")
    @Test
    public void testTictactoe1() {
        int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        String expected = "A";

        P1275_FindWinnerOnATicTacToeGame solution = new P1275_FindWinnerOnATicTacToeGame();
        assertEquals(expected, solution.tictactoe(moves));
    }

    @DisplayName("testTictactoe2")
    @Test
    public void testTictactoe2() {
        int[][] moves = {{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}};
        String expected = "B";

        P1275_FindWinnerOnATicTacToeGame solution = new P1275_FindWinnerOnATicTacToeGame();
        assertEquals(expected, solution.tictactoe(moves));
    }

    @DisplayName("testTictactoe3")
    @Test
    public void testTictactoe3() {
        int[][] moves = {{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}};
        String expected = "Draw";

        P1275_FindWinnerOnATicTacToeGame solution = new P1275_FindWinnerOnATicTacToeGame();
        assertEquals(expected, solution.tictactoe(moves));
    }

}

package leetcode.easy;

public class P1275_FindWinnerOnATicTacToeGame {
    public String tictactoe(int[][] moves) {
        int[][] board = new int[3][3];

        for (int i = 0; i < moves.length; i++) {
            board[moves[i][0]][moves[i][1]] = i % 2 == 0 ? 1 : 2;

        }
        return "Todo";
    }
}

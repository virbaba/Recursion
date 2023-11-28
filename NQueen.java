import java.util.ArrayList;

public class Solution {

    public static boolean isSafe(int[][] chessboard, int row, int col, int n){
        // Check if there is a queen in the same column
        for (int i = 0; i < row; i++) {
            if (chessboard[i][col] == 1)
                return false;
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 1)
                return false;
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (chessboard[i][j] == 1)
                return false;
        }

        return true;
    }

    public static void putQueen(int[][] chessboard, int row, int n, ArrayList<ArrayList<Integer>> ans) {
        if (row == n) {
            // If all queens are placed successfully, add the current arrangement to the answer list
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    list.add(chessboard[i][j]);
                }
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(chessboard, row, col, n)) {
                chessboard[row][col] = 1; // Place the queen

                // Recur for the next row
                putQueen(chessboard, row + 1, n, ans);

                // Backtrack and remove the queen from the current cell
                chessboard[row][col] = 0;
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[][] chessboard = new int[n][n];

        putQueen(chessboard, 0, n, ans);

        return ans;

    }
}

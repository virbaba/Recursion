public class Solution {
    public static boolean isSafe(int board[][], int val, int r, int c) {
        for (int i = 0; i < 9; i++) {

            if (board[r][i] == val)
                return false;

            if (board[i][c] == val)
                return false;

            if (board[3 * (r / 3) + i / 3][3 * (c / 3) + i % 3] == val)
                return false;

        }

        return true;
    }

    public static boolean sudokuSolver(int board[][]) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    for (int val = 1; val <= 9; val++) {
                        if(isSafe(board, val, row, col)){
                            board[row][col] = val;
                            if(sudokuSolver(board)){
                                return true;
                            }
                            else{
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }

            }
        }

        return true;

    }
}

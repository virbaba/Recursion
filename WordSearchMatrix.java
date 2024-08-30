public class Solution {
    public static boolean solveRec(char[][] board, String word, int i, int j, int n, int m, int wordIndex){
        if(wordIndex == word.length())
            return true;
        
        if(i == -1 || j == -1 || i == n || j == m || board[i][j] == ' ' || board[i][j] != word.charAt(wordIndex))
            return false;
        

        char ch = word.charAt(wordIndex);
        board[i][j] = ' ';

        boolean up = solveRec(board, word, i - 1, j, n, m, wordIndex + 1);
        boolean right = solveRec(board, word, i, j + 1, n, m, wordIndex + 1);
        boolean down = solveRec(board, word, i + 1, j, n, m, wordIndex + 1);
        boolean left = solveRec(board, word, i, j - 1, n, m, wordIndex + 1);

        if(up || right || down || left)
            return true;
        
        board[i][j] = ch;
        return false;
    }

    public static boolean present(char[][] board, String word, int n, int m) {
        // Write your code here.
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == word.charAt(0)){
                    if(solveRec(board, word, i, j, n, m, 0))
                        return true;
                }
                    
            }
        }
        return false;
    }
}

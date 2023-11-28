import java.util.* ;
import java.io.*; 
public class Solution {

    public static void solve(int[][] maze, int row, int col, int n, int[][] path, ArrayList<ArrayList<Integer>> ans){
        if(row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0 || path[row][col] == 1){
            return;
        }

        if(row == n - 1 && col == n - 1){
            path[row][col] = 1;
            ArrayList<Integer> list = new ArrayList<>();
            for(int r = 0; r < n; r++){
                for(int c = 0; c < n; c++){
                    list.add(path[r][c]);
                }
            }
            ans.add(list);
            path[row][col] = 0;
            return;
        }

        path[row][col] = 1;
        // down
        solve(maze, row+1, col, n, path, ans);
        // right
        solve(maze, row, col+1, n, path, ans);
        // top
        solve(maze, row-1, col, n, path, ans);
        // left
        solve(maze, row, col-1, n, path, ans);

        path[row][col] = 0;
    }
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[][] path = new int[n][n];
        solve(maze, 0, 0, n, path, ans);

        return ans;

    }
}

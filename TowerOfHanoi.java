import java.util.ArrayList;

public class Solution 
{
  /* 
    1. move n - 1 plate from src to mid and store it into move
    2. move larger plate from src to des and store it into move
    3. move n - 1 plate from mid to des and store it into move
  */
  
    private static void moveDisks(int n, int source, int mid, int destination, ArrayList<ArrayList<Integer>> moves) {
        if (n == 1) {
            ArrayList<Integer> move = new ArrayList<>();
            move.add(source);
            move.add(destination);
            moves.add(move);
            return;
        }
        moveDisks(n - 1, source, destination, mid, moves);
        ArrayList<Integer> move = new ArrayList<>();
        move.add(source);
        move.add(destination);
        moves.add(move);
        moveDisks(n - 1, mid, source, destination, moves);
    }
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        //    Write your code here.
        ArrayList<ArrayList<Integer>> moves = new ArrayList<>();
        moveDisks(n, 1, 2, 3, moves);
        return moves;

    }
}

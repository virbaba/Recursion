/*
  Time Complexity : O(2^N)
*/
import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> solve(int[] arr, int ind, int n){
        if(ind == n){
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            return ans;
        }

        ArrayList<ArrayList<Integer>> left = solve(arr, ind+1, n);
        while(ind < n - 1 && arr[ind] == arr[ind+1])
            ind++;
        ArrayList<ArrayList<Integer>> right = solve(arr, ind+1, n);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        ArrayList<Integer> t = new ArrayList<>();
        t.add(arr[ind]);
        ans.add(t);
        for(ArrayList<Integer> subset : left){
            subset.add(0, arr[ind]);
            ans.add(subset);
        }
        ans.addAll(right);
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..

        Arrays.sort(arr);
        return solve(arr, 0, n);

       

    }

}

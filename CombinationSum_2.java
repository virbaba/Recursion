import java.util.*;

public class Solution 
{   
    public static void solve(ArrayList<Integer> arr, int ind, int n, int target, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans){
        if(ind == n){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        list.add(arr.get(ind));
        solve(arr, ind+1, n, target-arr.get(ind), list, ans);
        list.remove(list.size()-1);
        while(ind < n-1 && arr.get(ind) == arr.get(ind+1))
            ind++;
        solve(arr, ind+1, n, target, list, ans);
    }
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        //    Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        Collections.sort(arr);

        solve(arr, 0, n, target, list, ans);

        return ans;

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Solution {
    public static void solve(int[] ARR, int B, List<Integer> list, List<List<Integer>> ans, int sum, int index){
        if(sum == B){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i < ARR.length && sum <= B; i++){
            sum += ARR[i];
            list.add(ARR[i]);
            solve(ARR, B, list, ans, sum, i);
            // backtracking 
            sum -= list.get(list.size()-1);
            list.remove(list.size()-1);
        }
    }
    public static List< List < Integer > > combSum(int []ARR, int B) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(ARR);

        int[] index = {0};
        solve(ARR, B, list, ans, 0, 0);
        // System.out.println(ans);
        return ans;
    }
}

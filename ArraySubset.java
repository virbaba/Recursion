import java.util.*;
class Solution {
    public void solve(int[] nums, int index, List<Integer> curr, List<List<Integer>> res){
        if(index ==  nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[index]);
        solve(nums, index+1, curr, res);
        curr.remove(curr.size()-1);
        solve(nums, index+1, curr, res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        solve(nums, 0, curr, res);

        return res;

    }
}

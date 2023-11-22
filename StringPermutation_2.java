import java.util.*;

public class Solution {
	
	public static ArrayList<String> solve(String str){
		if(str.length() == 1){
			ArrayList<String> ans = new ArrayList<>();
			ans.add(str);
			return ans;
		}

		ArrayList<String> res = solve(str.substring(1));

		ArrayList<String> ans = new ArrayList<>();

		for(int i = 0; i < res.size(); i++){
			String curr = res.get(i);
			for(int j = 0; j <= curr.length(); j++){
				String s = curr.substring(0, j) + str.charAt(0) + curr.substring(j);
				ans.add(s);
			}
		}

		return ans;

	}
	public static ArrayList<String> generatePermutations(String str) {
		// Write your code here
		
		ArrayList<String> ans = solve(str);
		Collections.sort(ans);

		return ans;

	}
}

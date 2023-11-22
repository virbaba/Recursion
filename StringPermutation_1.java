import java.util.*;

public class Solution {
	
	public static StringBuffer swap(StringBuffer s, int i, int j){
		char c = s.charAt(i);
		s.setCharAt(i, s.charAt(j));
		s.setCharAt(j, c);

		return s;
	}
	public static void solve(StringBuffer s, int i, ArrayList<String> ans){
		if(i == s.length() - 1){
			ans.add(s.toString());
			return;
		}

		for(int j = i; j < s.length(); j++){
			s = swap(s, i, j);
			solve(s, i + 1, ans);
			s = swap(s, i, j); // Backtrack to restore the original string
		}
	}
	public static ArrayList<String> generatePermutations(String str) {
		// Write your code here
		StringBuffer s = new StringBuffer(str);
		ArrayList<String> ans = new ArrayList<>();

		solve(s, 0, ans);
		Collections.sort(ans);
		return ans;

	}
}

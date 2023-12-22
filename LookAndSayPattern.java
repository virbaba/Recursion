public class Solution {
	public static String lookAndSaySequence(int n) {
		// Write your code here.
		if (n == 1)
			return "1";

		String str = lookAndSaySequence(n - 1);
		int s = 0, e = 1;
		StringBuffer ans = new StringBuffer();
		while (e < str.length()) {
			if (str.charAt(s) != str.charAt(e)) {
				int diff = e - s;
				ans.append("" + diff + str.charAt(s));
				s = e;
			}
			e++;
		}
		int diff = e - s;
		ans.append("" + diff + str.charAt(s));
		return ans.toString();
	}
}

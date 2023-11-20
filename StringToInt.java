
public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
		if(input.length() == 1)
			return Integer.parseInt(input);
		
		int res = convertStringToInt(input.substring(1));

		int l = input.length() - 1;
		int n = Integer.parseInt(""+input.charAt(0));
		int ans = n * (int)Math.pow(10, l) + res;
		return ans;
	}
}

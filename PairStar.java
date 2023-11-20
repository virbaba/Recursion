
public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
		if(s.length() == 1)
			return s;
		
		
		String res = addStars(s.substring(1));

		if(s.charAt(0) == res.charAt(0)){
			res = "*" + res;
			res = s.charAt(0) + res;
		}
		else{
			res = s.charAt(0) + res;
		}

		return res;

	}
}

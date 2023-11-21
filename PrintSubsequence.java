public class solution {

	public static void subSeq(String str, String sub){
        if(str.length() == 0){
            System.out.println(sub);
            return;
        }
        
        subSeq(str.substring(1), sub+str.charAt(0));
        subSeq(str.substring(1), sub);

    }
	public static void printSubsequences(String str) {
		// Write your code here
		subSeq(str, "");

	}
}

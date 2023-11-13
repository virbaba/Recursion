import java.math.BigInteger;
public class Solution {
	public static BigInteger fact(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(fact(n - 1));
        }
    }
	public static void factorial(int n) {
		// Write your code here
		System.out.print(fact(n));
	}
}

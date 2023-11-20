/*
  Given an integer array A of size N, check if the input array can be divided in two groups G1 and G2 with following properties-
Sum of both group elements are equal
- Group 1: All elements in the input, which are divisible by 5
- Group 2: All elements in the input, which are divisible by 3 (but not divisible by 5).
- Elements which are neither divisible by 5 nor by 3, can be put in either group G1 or G2 to satisfy the equal sum property.
Group 1 and Group 2 are allowed to be unordered and all the elements in the Array A must belong to only one of the groups.
Return true, if array can be split according to the above rules, else return false.
*/
  
public class solution {

	public static boolean check(int[] input, int index, int n, int lsum, int rsum){
		if(index == n)
			return lsum == rsum;
		
		if(input[index] % 3 == 0){
			return check(input, index + 1, n, lsum + input[index], rsum);
		}
		if(input[index] % 5 == 0){
			return check(input, index + 1, n, lsum , rsum + input[index]);
		}

		boolean left = check(input, index+1, n, lsum+input[index], rsum);
		boolean right = check(input, index+1, n, lsum, rsum +input[index]);

		return left || right;

		
	}

	public static boolean splitArray(int input[]) {
	
		return check(input, 0, input.length, 0, 0);
	}
	

}


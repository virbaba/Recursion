public class solution {

	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] solve(int[] input, int ind, int k){
		if(ind == input.length){
			if(k == 0){
				return new int[1][0];
			}
			return new int[0][0];
		}

		int[][] left = solve(input, ind + 1, k - input[ind]);
		int[][] right = solve(input, ind + 1, k);

		int[][] ans = new int[left.length + right.length][];

		int index = 0;
		
		for(int i = 0; i < right.length; i++){
			ans[index] = new int[right[i].length];
			for(int j = 0; j < right[i].length; j++){
				ans[index][j] = right[i][j];
			}
			index++;
		}

		for(int i = 0; i < left.length; i++){
			ans[index] = new int[left[i].length + 1];
			ans[index][0] = input[ind];
			for(int j = 1; j <= left[i].length; j++){
				ans[index][j] = left[i][j-1];
			}
			index++;
		}

		return ans;
	}
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
		int[][] ans = solve(input, 0, k);

		return ans;
	}
}

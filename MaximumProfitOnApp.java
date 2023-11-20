import java.util.*;
public class solution {

	public static int maximumProfit(int budget[]) {
		// Write your code here

		Arrays.sort(budget);

		int max = Integer.MIN_VALUE;

		for(int i = 0; i < budget.length; i++){
			int res = budget[i] * (budget.length - i);
			if(max < res)
				max  = res;
		}

		return max;
	}

}

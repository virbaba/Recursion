
public class Solution {

	public static int minCount(int n) {
		//Your code goes here
		if(n == 0)
         return 0;
        
        if(n == 1)
            return 1;
        
        int res = 1;

        for(int i = 1; i * i <= n; i++){
           int small = minCount(n - i * i);
           int min = Math.min(res, small);
           res = 1 + min;
        }

        return res;
	}

}

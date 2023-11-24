import java.util.*;

public class Solution {

    public static int fact(int n){
        if(n == 1)
            return 1;
        return n * fact(n-1);
    }
   
    public static String kthPermutation(int n, int k) {
        // Write your code here.
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        String ans = "";

        k = k - 1;

        while(k != 0){
            int f = fact(n-1);
            int index  = k / f;
            k = k % f;

            ans += list.get(index);
            list.remove(index);
            n -= 1;

        }
        for(int e : list){
            ans += e;
        }

        return ans;
    }
}

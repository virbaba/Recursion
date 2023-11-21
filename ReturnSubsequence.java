import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

class Solution {
    public static void solve(String str, ArrayList<String> list, String output){
        if(str.length() == 0){
            if(!output.equals("")){
                list.add(output);
            }
            return;
        }

        solve(str.substring(1), list, output);
        output += str.charAt(0);
        solve(str.substring(1), list, output);

    }
    public static ArrayList<String> subsequences(String str) {
        ArrayList<String> list = new ArrayList<>();
        solve(str, list, "");
        return list;
    }
}

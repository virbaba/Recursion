import java.util.* ;
import java.io.*; 
public class Solution {
    public static String getCode(char c){
        if(c == '2')
            return "abc";
        else if(c == '3')
            return "def";
        else if(c == '4')
            return "ghi";
        else if(c == '5')
            return "jkl";
        else if(c == '6')
            return "mno";
        else if(c == '7')
            return "pqrs";
        else if(c == '8')
            return "tuv";
        
        return "wxyz";
    }

    public static List<String> findPossibleWords(String s) {
        // Write your code here.
        if(s.length() == 1){
            String code = getCode(s.charAt(0));
            List<String> ans = new ArrayList<>();
            for(int i = 0; i < code.length(); i++){
                ans.add(""+code.charAt(i));
            }
            return ans;
        }

        List<String> res = findPossibleWords(s.substring(1));

        String code = getCode(s.charAt(0));

        List<String> ans = new ArrayList<>();

        for(int i = 0; i < code.length(); i++){
            char c = code.charAt(i);
            for(int j = 0; j < res.size(); j++){
                String ele = res.get(j);
                ans.add(c+ele);
            }
        }

        return ans;
        
    }
}

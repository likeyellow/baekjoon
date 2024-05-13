import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] org = s.split("");
        
        Arrays.sort(org, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < org.length; i++) {
            sb.append(org[i]);        
        }
        
        return answer = sb.toString();
    }
}
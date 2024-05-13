import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = Integer.MAX_VALUE;
        
        for(int i = 2; i < n; i++) {
            if((n % i) != 1) {
                continue;
            }
            answer = Math.min(answer, i);    
        }
        return answer;
    }
}
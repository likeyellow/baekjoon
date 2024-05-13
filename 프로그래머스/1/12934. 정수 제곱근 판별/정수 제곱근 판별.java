import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = -1;
        long limit = (long) Math.sqrt(n);
        
        for(long i = 1; i <= limit; i++) {
            if((i*i) == n) {
                answer = (long) Math.pow(i+1, 2);
            }           
        }
        
        return answer;
    }
}
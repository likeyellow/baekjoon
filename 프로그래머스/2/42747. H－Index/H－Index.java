import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length -1; i++) {
            int value = citations[i];
            int n = citations.length - i;
            
            int min = Math.min(value, n);
            answer = Math.max(answer, min);
            
        }
        
        return answer;
    }
}
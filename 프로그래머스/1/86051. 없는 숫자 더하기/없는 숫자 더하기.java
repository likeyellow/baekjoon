import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int tmp = 0;
        for(int i = 0; i < numbers.length; i++) {
             tmp += numbers[i];
        }
        return answer = 45 - tmp;
    }
}
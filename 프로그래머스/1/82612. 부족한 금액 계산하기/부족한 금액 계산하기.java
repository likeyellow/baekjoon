import java.lang.Math;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        
        for(int i = count; i > 0; i--) {
            sum += price * i;
        }
        if(sum <= money) {
            answer = 0;
        } else {
            answer = sum - money;
        }

        
        return answer;
    }
}
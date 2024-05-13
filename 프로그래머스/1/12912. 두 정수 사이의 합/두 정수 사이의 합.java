class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int big, small = 0;
        
        if(a < b) {
            small = a;
            big = b;
        } else {
            small = b;
            big = a;
        }
        for(int i = small; i <= big; i++) {
            answer += i;
        }
        return answer;
    }
}
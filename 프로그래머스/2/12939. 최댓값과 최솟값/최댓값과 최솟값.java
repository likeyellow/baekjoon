class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");
        int max = Integer.parseInt(answer[0]);
        int min = Integer.parseInt(answer[0]);
        int n;
        for(int i = 1; i < answer.length; i++) {
            n = Integer.parseInt(answer[i]);
            if(min > n) {
                min = n;
            }
            if(max < n) {
                max = n;
            }
        }
        
        return min + " " + max;
    }
}
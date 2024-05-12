class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean isNagative = false;
        
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '-') {
                isNagative = true;
                continue;
            } else if(ch == '+') {
                continue;
            } else {
                int num = ch - '0';
                int weight = (int) Math.pow(10, s.length() - i - 1);
            
                answer += num * weight;
            }

        }
        
        return isNagative ? answer * - 1 : answer;
    }
}
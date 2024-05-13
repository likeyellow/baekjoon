class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        int len = s.length();
        
        for(char ch : s.toCharArray()) {
            if((len == 4 || len == 6) 
               && (!s.matches(".*[a-zA-Z].*"))) {
                answer = true;
            }
        }
        
        return answer;
    }
}
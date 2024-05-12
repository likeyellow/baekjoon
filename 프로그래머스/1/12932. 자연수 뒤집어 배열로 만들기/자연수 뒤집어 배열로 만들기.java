class Solution {
    public int[] solution(long n) {
        
        String str = Long.toString(n); 
        
        int[] answer = new int[str.length()];
        
        for(int i = str.length() -1; i >= 0; i--) {
            char ch = str.charAt(i);
            int num = ch - '0';
            
            answer[str.length() -1 - i] = num;            
        }     
        return answer;
    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int[] cnt = new int[2]; 
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == 'p' || ch == 'P') {
                cnt[0]++;
            } else if(ch == 'y' || ch == 'Y') {
                cnt[1]++;
            }    
        }
        if(cnt[0] != cnt[1]) {
            answer = false;
        }
        
        

        return answer;
    }
}
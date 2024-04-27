import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(st.isEmpty()) {
                st.push(s.charAt(i));
            } else {
                char ch = s.charAt(i); // 현재 문자
                
                if(st.peek() == ch) {
                    st.pop();
                } else {
                    st.push(ch);
                }    
            }
        }      
        return st.isEmpty() ? 1 : 0;
    }
}
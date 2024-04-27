import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack st = new Stack();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == '(') {
                st.push('(');
            } else if(ch == ')') {
                if(st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }
        
        return st.isEmpty();
    }
}
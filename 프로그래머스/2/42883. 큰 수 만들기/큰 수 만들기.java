import java.util.*;

class Solution {
    /*
    static boolean[] isSelected;
    static String input;
    static String finalRst = "";
    public static String combination(String number, int n, int r, int start, int depth, StringBuilder sb) {
        if(depth == r) {
            String result = sb.toString();
            if (result.compareTo(finalRst) > 0) {
                finalRst = result;
            }
            return finalRst;
        }
        for(int i = start; i < n; i++) {
            if(!isSelected[i]) {
                isSelected[i] = true;
                sb.append(number.charAt(i));
                combination(number, n, r, i+1, depth+1, sb);
                sb.deleteCharAt(sb.length() - 1);
                isSelected[i] = false;
            }          
        }
        return finalRst;
    }
    public String solution(String number, int k) {
        int N = number.length(); 
        int R = number.length() - k;        
        isSelected = new boolean[N];
        StringBuilder sb = new StringBuilder();
        
        return combination(number, N, R, 0, 0, sb);
    }
    // 순열로 하니 시간 초과 나옴 ㅜㅡ
    */
    
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        char max;
        for(int i = 0; i < number.length() - k; i++) {
            max = '0';
            for(int j = idx; j <= k + i; j++){
                if(max < number.charAt(j)){
                    max = number.charAt(j); 
                    idx = j + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }    
}
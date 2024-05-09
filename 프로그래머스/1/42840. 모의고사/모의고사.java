import java.util.*;

class Solution {   
    public int[] solution(int[] answers) {
        int[] result = new int[3];
        
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        result[0] = check(p1, answers);
        result[1] = check(p2, answers);
        result[2] = check(p3, answers);
        
        int max = Math.max(Math.max(result[0], result[1]), result[2]);
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i < result.length; i++) {   
            //result = new int[] {max};
            if(max == result[i]) {
                list.add(i+1);
            } 
        } 
            
        int[] result2 = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result2[i] = list.get(i);
        }
        return result2;
    }
    private static int check(int[] paper, int[] answer) {  
        int cnt = 0;
        
        for(int i = 0; i < answer.length; i++) {
            int j = i % paper.length;
            if(answer[i] == paper[j]) {
                cnt++;
            }            
        }
        return cnt;
    }
        
}
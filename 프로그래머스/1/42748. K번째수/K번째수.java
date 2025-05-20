import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] tmpArr; 
        int[] pickArr = {};
        for(int i = 0; i < commands.length; i++){          
                tmpArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
                Arrays.sort(tmpArr);
                answer[i] = tmpArr[commands[i][2]-1];
         }
    
        return answer;
    }
    }
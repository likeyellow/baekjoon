import java.util.*;

class Solution {
    static Set<Integer> result = new HashSet<>();
    static boolean[] isCheck;
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int len = numbers.length;
        isCheck = new boolean[len];
        
        comb(numbers, 0, len, 2, 0);
        
        answer = result.stream().mapToInt(i -> i).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
    static void comb(int[] nums, int start, int n, int r, int sum) {
        if(r == 0) {
            result.add(sum);
            return;
        }
        for(int i = start; i < n; i++) {
            if(!isCheck[i]) {
                isCheck[i] = true;
                comb(nums, i+1, n, r-1, sum + nums[i]);
                isCheck[i] = false;
            }
        }
    }
    
}
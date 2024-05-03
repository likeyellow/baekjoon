import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> man = new HashMap<>();
        
        for(String part : participant) {
            man.put(part, man.getOrDefault(part, 0) + 1);
        }
        
        for(int i = 0; i < completion.length; i++) {
            man.put(completion[i], man.get(completion[i]) -1);
        }                                          
        
        for(String key : man.keySet()) {
            if(man.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}
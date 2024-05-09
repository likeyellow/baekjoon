import java.util.*;

class Solution {
    //static int max_cnt;
    //static String[] sub_set;
    
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            if(!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }
        return answer -1;
        
        //for(int i = 0; i < clothes.length; i++) {
        //    max_cnt = i;
        //    sub_set = new String[i];
            
        //    Combination(0, 0, clothes[i][0]);     
        //}
        //answer = sub_set.length;
        //return answer;
    }
    
    //private static void Combination(int cnt, int k, String type) {
        //if(cnt == max_cnt) {
            //System.out.println(Arrays.toString(sub_set));
            //return;
        //}
        //for(int i = k; i < type.length(); i++) {
        //    sub_set[cnt] = type;
        //    Combination(cnt + 1, i + 1, type);           
        //}
    //}
}
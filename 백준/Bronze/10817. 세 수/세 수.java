import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        
        try {
            String[] nums = br.readLine().split(" ");
            for(int i = 0; i < 3; i++) {
                list.add(Integer.parseInt(nums[i]));        
            }
            list.sort((o1, o2) -> o1.compareTo(o2));
            
            System.out.println(list.get(1));
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
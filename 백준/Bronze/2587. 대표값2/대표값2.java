import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        String line;
        
        try {
            while((line = br.readLine()) != null){
                list.add(Integer.parseInt(line));
            }
            
            int sum = 0;
            for(int num : list) {
                sum += num;
            }
            int avg = sum / list.size();
            System.out.println(avg);
            
            list.sort((o1, o2) -> o1.compareTo(o2));
            int mid;
            int size = list.size();
            if(size % 2 == 1){
                mid = list.get(size / 2);
            }else{
                mid = (list.get(size / 2 -1) + list.get(size / 2)) / 2;
            }
            System.out.println(mid);
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
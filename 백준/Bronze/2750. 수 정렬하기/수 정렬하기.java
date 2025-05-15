import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        ArrayList<Integer> list = new ArrayList();
        
        try {
            n = Integer.parseInt(br.readLine());
            for(int i = 0; i < n; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }
            
            list.sort((o1, o2) -> o1 - o2);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
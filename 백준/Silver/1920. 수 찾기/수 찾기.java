import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int n = Integer.parseInt(br.readLine());
            String[] nToken = br.readLine().split(" ");
            Set<Integer> nSet = new HashSet<>();
            for(int i = 0; i < n; i++){
                nSet.add(Integer.parseInt(nToken[i]));
            }
            int m = Integer.parseInt(br.readLine());
            String[] mToken = br.readLine().split(" ");                        
            ArrayList<Integer> mList = new ArrayList<>();
            for(int j = 0; j < m; j++){
                mList.add(Integer.parseInt(mToken[j]));
            }
            
            for(Integer num : mList){
                System.out.println(nSet.contains(num) ? 1 : 0);
            }

        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}
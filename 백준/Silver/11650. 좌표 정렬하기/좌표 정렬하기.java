import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = null;
        int[][] points;
        
        try {
            int N = Integer.parseInt(br.readLine());
            points = new int[N][2];
            
            for(int i = 0; i < N; i++) {
                line = br.readLine().split(" ");   
                points[i][0] = Integer.parseInt(line[0]);
                points[i][1] = Integer.parseInt(line[1]);
            }
            
            Arrays.sort(points, (a,b) -> {
                if(a[0] == b[0]) {
                    return Integer.compare(a[1],b[1]);
                }
                return Integer.compare(a[0], b[0]);
            });
            
            StringBuilder sb = new StringBuilder();
            for(int[] point : points) {
                sb.append(point[0]).append(" ").append(point[1]).append("\n");
            }
            System.out.print(sb);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
import java.util.Scanner;
import java.util.Arrays;

class Main {
    static int n, m;
    static boolean[] check;
    static int[] numbers;
    static int[] result;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        numbers = new int[n];
        result = new int[m];
        check = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);  
        perm(0);
    }
    
    public static void perm(int depth) {
        if(depth == m) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < m; i++) {
                sb.append(result[i] + " ");
            }
            System.out.println(sb);
            return;
        }
        for(int i = 0; i < n; i++) {
            if(!check[i]) {
                check[i] = true;
                result[depth] = numbers[i];
                perm(depth + 1);
                check[i] = false;
            }
        }       
    }
}
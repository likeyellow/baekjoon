import java.util.Scanner;
import java.util.Arrays;

class Main {
    static int n, m;
    static int[] numbers;
    static int[] result;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        numbers = new int[n];
        result = new int[m];
        for(int i = 0; i < n; i++)
            numbers[i] = sc.nextInt();
        Arrays.sort(numbers);
        perm(0, 0);
        System.out.print(sb);
    }
    
    static StringBuilder sb = new StringBuilder();
    public static void perm(int depth, int start) {
        if(depth == m) {
            for(int i = 0; i < m; i++) {
                sb.append(result[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = start; i < n; i++) {
            result[depth] = numbers[i];
            perm(depth + 1, i);
        }
    }
}
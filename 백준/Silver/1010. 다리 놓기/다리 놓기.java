import java.util.Scanner;

class Main {
    static long[][] d;
    
    public static void main(String[] args) {
        d = new long[31][31];
        for(int i = 0; i <= 30; i++) {
            d[i][1] = i;
            d[i][0] = 1;
            d[i][i] = 1;
        }
        for(int i = 2; i <= 30; i++) {
            for(int j = 1; j < i; j++) {
                d[i][j] = d[i-1][j] + d[i-1][j-1];
            }
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(d[m][n]);
        }
    }
}
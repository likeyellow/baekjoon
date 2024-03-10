import java.util.Scanner;

class Main {
    static int n, k;
    static int[][] dp;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        dp = new int[n+1][n+1];
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 1;
            dp[i][1] = i;
            dp[i][i] = 1;
        }
        for(int i = 2; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                dp[i][j] = dp[i][j] % 10007;
            }
        }
        System.out.println(dp[n][k]);
    }
}
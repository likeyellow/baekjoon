import java.util.Scanner;
// 동적탐색을 이용
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coin = new int[n];
        int[] dp = new int[k+1];
        for(int i = 1; i <= k; i++) {
            dp[i] = 100001;
        }
        for(int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
            if(coin[i] <= k)
                dp[coin[i]] = 1;
        }
        for(int i = 1; i <= k; i++) {
            for(int j = 0; j < n; j++) {
                // {i}값을 만들고 싶을 때
                if(i - coin[j] >= 0)
                    dp[i] = Math.min(dp[i], dp[i - coin[j]] + 1);
            }
        }
        if(dp[k] == 100001) {
            System.out.println(-1);
        } else {
            System.out.println(dp[k]);
        }
    }
}
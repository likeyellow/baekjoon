import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		// 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M   
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] nums = new int[N+1];
        for(int i = 1; i <= N; i++) {
            nums[i] = sc.nextInt();
        }
        // 구간합 배열 만들기
        int[] result = new int[N+1];
        for(int i = 1; i <= N; i++) {
            result[i] = result[i-1] + nums[i];
        }
        // 구간합 구하기
        while(M-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(result[r] - result[l-1]);
        }
    }
}

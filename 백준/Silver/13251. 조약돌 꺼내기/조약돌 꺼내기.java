import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0; // 조약돌 총개수
        int m; // 조약돌 색깔 종류수
        int k; // 뽑는 조약돌 개수
        int[] color = new int[51]; // 최대 50가지 색깔을 받을 수 있다함
        
        m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            color[i] = sc.nextInt();
            total += color[i];  // 총 조약돌 수 구함
        }
        
        k = sc.nextInt(); // 몇개 뽑을지 입력 받음
        
        double[][] combination = new double[2501][2501]; // 조약돌 최대개수 50개 x 뽑을 수 있는 조약돌 최대개수 50 = 2500 임
        combination[1][0] = 1;
        combination[1][1] = 1;
        combination[0][0] = 1;
        
        for(int i = 2; i <= total; i++) {
            combination[i][i] = combination[i][0] = 1;
            
            for(int j = 1; j <= i; j++) {
                combination[i][j] = combination[i-1][j-1] + combination[i-1][j];
            }
        }
        double all = combination[total][k];
        
        // color[i] C k 를 계산한 값들을 모두 더한 후에 조약돌 전체개수(total) C k 로 나눈다.
        double tmp = 0.0;
        for(int i = 0; i < m; i++) {
            tmp += combination[color[i]][k];
        }
        System.out.println(tmp / all);
    }
}
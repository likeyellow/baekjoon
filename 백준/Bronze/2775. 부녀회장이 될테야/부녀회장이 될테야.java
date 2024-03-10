import java.util.Scanner;

class Main {
    static int t, n, k;
    static int[][] d;
    
    public static void main(String[] args) {
        d = new int[15][15];
        for(int i = 0; i < 15; i++) { // 초기화
            d[i][1] = 1;
            d[0][i] = i;
        }
        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                d[i][j] = d[i][j-1] + d[i-1][j]; // 점화식
            }
        }
        
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int i = 0; i < t; i++) { // d배열을 모두 구해 놓은 후 질의 출력하기
            k = sc.nextInt();
            n = sc.nextInt();
            System.out.println(d[k][n]);
        }
            
    }
}
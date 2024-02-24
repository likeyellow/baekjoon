import java.util.Scanner;
// 첫째 줄에 도시의 수 N이 주어진다. (2 ≤ N ≤ 10) 다음 N개의 줄에는 비용 행렬이 주어진다. 
// 각 행렬의 성분은 1,000,000 이하의 양의 정수이며, 갈 수 없는 경우는 0이 주어진다. 
// W[i][j]는 도시 i에서 j로 가기 위한 비용을 나타낸다.
// 항상 순회할 수 있는 경우만 입력으로 주어진다.
// 첫째 줄에 외판원의 순회에 필요한 최소 비용을 출력한다.
class Main {
    static int n;
    static int[][] w;
    static boolean[] visited;
    static int answer = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        w = new int[n][n];
        visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                w[i][j] = sc.nextInt();
            }
        }
        travel(0,0,0,0);
        System.out.println(answer);
    }
    public static void travel(int start, int node, int sum, int cnt) {
        // base case
        if(cnt == n && start == node) {
            answer = Math.min(sum, answer);
            return;
        }
        // recursive case
        for(int i = 0; i < n; i++) {
            if(!visited[i] && w[node][i] != 0) {
                visited[i] = true;
                travel(start, i, sum + w[node][i], cnt + 1);
                visited[i] = false;
            }
        }
    }
}
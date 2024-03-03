import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
/*
첫째 줄에 두 정수 N, M(2 ≤ N, M ≤ 100)이 주어진다. 
다음 N개의 줄에는 M개의 정수로 미로가 주어진다. 각각의 수들은 붙어서 입력으로 주어진다.
첫째 줄에 지나야 하는 최소의 칸 수를 출력한다. 항상 도착위치로 이동할 수 있는 경우만 입력으로 주어진다.
4 6
101111
101010
101011
111011
*/
class Point {
    int r, c;
    Point(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
class Main {
    static int n, m;
    static int[][] maze;
    static int[][] visited;
    
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        maze = new int[n+1][m+1];
        visited = new int[n+1][m+1];
        for(int i = 1; i <=n; i++) {
            String line = sc.next();
            for(int j = 1; j <= m; j++) {
                maze[i][j] = line.charAt(j-1) - '0'; 
            }
        }
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(1,1));
        visited[1][1] = 1;
        while(!q.isEmpty()) {
            Point now = q.poll();
            for(int i = 0; i < 4; i++) {
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];
                if(nc <= 0 || nc > m || nr <= 0 || nr > n) continue;
                if(visited[nr][nc] == 0 && maze[nr][nc] == 1) {
                    visited[nr][nc] = visited[now.r][now.c] + 1;
                    q.add(new Point(nr, nc));
                }
            }
        }
        System.out.println(visited[n][m]);
    }   
}
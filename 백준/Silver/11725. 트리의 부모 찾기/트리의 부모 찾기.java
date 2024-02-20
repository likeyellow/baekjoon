import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
    static List<Integer>[] tree;
    static int[] parents;
    static boolean[] check;
    
    public static void main(String[] args) {
// 첫째 줄에 노드의 개수 N (2 ≤ N ≤ 100,000)이 주어진다. 
// 둘째 줄부터 N-1개의 줄에 트리 상에서 연결된 두 정점이 주어진다.
// 첫째 줄부터 N-1개의 줄에 각 노드의 부모 노드 번호를 2번 노드부터 순서대로 출력한다.        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        tree = new ArrayList[n+1];
        parents = new int[n+1];
        check = new boolean[n+1];
        for(int i = 0; i < n+1; i++) {
            tree[i] = new ArrayList<>();
        }
        for(int i = 0; i < n-1; i++) {
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            tree[node1].add(node2);
            tree[node2].add(node1);
        }
        find(1);
        for(int i = 2; i <= n; i++)
            System.out.println(parents[i]);
    }
    
    public static void find(int nodeNum) { // nodeNum = 현재 탐색하고 있는 노드번호
        check[nodeNum] = true;
        for(int i = 0; i < tree[nodeNum].size(); i++) {
            int child = tree[nodeNum].get(i);
            if(!check[child]) {
                parents[child] = nodeNum;
                find(child); // 자식을 부모로 하는 서브트리를 다시 탐색
            }
        }
    }
}
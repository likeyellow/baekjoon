import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
    static int answer;
    static List<Integer>[] tree;
    static int s;
    static int[] numbers;
    
    public static void main(String[] args) {
// 첫째 줄에 정수의 개수를 나타내는 N과 정수 S가 주어진다. (1 ≤ N ≤ 20, |S| ≤ 1,000,000) 
// 둘째 줄에 N개의 정수가 빈 칸을 사이에 두고 주어진다. 주어지는 정수의 절댓값은 100,000을 넘지 않는다.
// 출력
// 첫째 줄에 합이 S가 되는 부분수열의 개수를 출력한다.        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s = sc.nextInt();
        numbers = new int[n];
        for(int i = 0; i < n; i++)
            numbers[i] = sc.nextInt();
        
        solve(0, 0);
        System.out.println(answer);
    }
    
    public static void solve(int idx, int sum) {
        // base case - 종료 조건
        if(idx == numbers.length) return;
        if(sum + numbers[idx] == s) answer++;
        
        // recursive case - 재귀 반복 조건 
        solve(idx + 1, sum + numbers[idx]); // 해당 인덱스의 수를 뽑고 다음 인덱스로 넘김
        solve(idx + 1, sum); // 해당 인덱스의 수를 뽑지 않고 다음 인덱스로 넘김
    }
}
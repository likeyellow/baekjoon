import java.util.Scanner;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            pq.offer(sc.nextInt());
        }
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n; j++) {
                pq.offer(sc.nextInt());
                pq.poll();
            }
        }
        System.out.println(pq.poll());
    }
}
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Queue<Integer> q = new LinkedList<>();
        while(true) {
            int cmd = sc.nextInt();
            if(cmd > 0) {
                if(q.size() < N)
                    q.offer(cmd);
            } else if(cmd == 0) {
                q.poll();
            } else break; 
        }
        if(q.size() == 0) System.out.println("empty");
        else {
            while(!q.isEmpty()){
                System.out.printf(q.poll() + " ");
            }
            System.out.println();
        }
    }
}
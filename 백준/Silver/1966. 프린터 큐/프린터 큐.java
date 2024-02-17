import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    static class Job {
        int idx;
        int priority;
        Job (int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //각 테스트 케이스에 대해 문서가 몇 번째로 인쇄되는지 출력        
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            Queue<Job> q = new LinkedList<>();
            Integer[] prioritySeqeuence = new Integer[N];
            for(int i = 0; i < N; i++) {
                prioritySeqeuence[i] = sc.nextInt();
                q.offer(new Job(i, prioritySeqeuence[i]));
            }
            Arrays.sort(prioritySeqeuence, Collections.reverseOrder());
            
            for(int i = 0; i < N; i++) {
                while(q.peek().priority != prioritySeqeuence[i])
                    q.offer(q.poll());
                if(q.peek().idx == M) {
                    System.out.println(i + 1);
                    break;
                }
                q.poll();
            }
            
        }
    }
}
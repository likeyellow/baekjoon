import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
//		push X: 정수 X를 스택에 넣는 연산이다.
//		pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 
//           만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 스택에 들어있는 정수의 개수를 출력한다.
//		empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//		top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        while(N-- > 0) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push")) {
                stack.addLast(Integer.parseInt(cmd[1])); 
            } else if(cmd[0].equals("pop")) {
                bw.append(stack.isEmpty() ? "-1\n" : stack.removeLast() + "\n");
            } else if(cmd[0].equals("size")) {
                bw.append(stack.size() + "\n");
            } else if(cmd[0].equals("empty")) {
                bw.append(stack.isEmpty() ? "1\n" : "0\n"); 
            } else if(cmd[0].equals("top")) {
                bw.append(stack.isEmpty() ? "-1\n" : stack.getLast() + "\n");
            }
        }
        bw.flush();
    }
}
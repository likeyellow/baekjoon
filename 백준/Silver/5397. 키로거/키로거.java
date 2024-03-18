import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            char[] input = sc.next().toCharArray();
            Deque<Character> beforeCursor = new ArrayDeque<>();
            Deque<Character> afterCursor = new ArrayDeque<>();
            
            for(char cmd : input) {
                if(cmd == '-') { // 커서 앞 글자 삭제
                    if(!beforeCursor.isEmpty())
                        beforeCursor.removeLast();
                } else if(cmd == '<') { // 왼쪽으로 커서 이동
                    if(!beforeCursor.isEmpty())
                        afterCursor.addLast(beforeCursor.removeLast());
                } else if(cmd == '>') { // 오른쪽으로 커서 이동
                    if(!afterCursor.isEmpty())
                        beforeCursor.addLast(afterCursor.removeLast());
                } else { // 커서 앞에 글자 추가
                    beforeCursor.addLast(cmd);
                }
            }
            StringBuilder sb = new StringBuilder();
            while(!beforeCursor.isEmpty()) sb.append(beforeCursor.removeFirst());
            while(!afterCursor.isEmpty()) sb.append(afterCursor.removeLast());
            System.out.println(sb);
        }
    }
}
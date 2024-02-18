import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        
        int openCount = 0;
        int result = 0;
        
        for(int i = 0; i < input.length; i++) {
            if(input[i] == '(') {
                openCount++;
            } else if(input[i] == ')') {
                openCount--;
                if(input[i-1] == '(')
                    result += openCount;
                else result++;
            }
        }
        System.out.println(result);     
    }
}
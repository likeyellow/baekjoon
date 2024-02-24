import java.util.Scanner;
// 첫째 줄에 수의 개수 N(2 ≤ N ≤ 11)가 주어진다. 
// 둘째 줄에는 A1, A2, ..., AN이 주어진다. (1 ≤ Ai ≤ 100) 
// 셋째 줄에는 합이 N-1인 4개의 정수가 주어지는데, 
// 차례대로 덧셈(+)의 개수, 뺄셈(-)의 개수, 곱셈(×)의 개수, 나눗셈(÷)의 개수이다.	
// N개의 수와 N-1개의 연산자가 주어졌을 때, 
// 만들 수 있는 식의 결과가 최대인 것과 최소인 것을 구하는 프로그램을 작성하시오.
class Main {
	public static final int PLUS = 0;
	public static final int MINUS = 1;
	public static final int MUL = 2;
	public static final int DIV = 3;
	
	public static int n;
	public static int[] numbers;
	public static int[] operators = new int[4];
	
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }    
        for(int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }
        solve(1, numbers[0]);
        System.out.println(max);
        System.out.println(min);
    }
	static void solve(int index, int sum) {
		// base case
		if(index == n) {
			if(sum > max) max = sum;
			if(sum < min) min = sum;
			return;
		}
		// recursive case
		for(int i = 0; i < 4; i++) {
			if(operators[i] > 0) {
				operators[i]--;
				switch(i) {
                    case PLUS : 
                        solve(index + 1, sum + numbers[index]);
                        break;
                    case MINUS : 
                        solve(index + 1, sum - numbers[index]);
                        break;
                    case MUL : 
                        solve(index + 1, sum * numbers[index]);
                        break;
                    case DIV : 
                        solve(index + 1, sum / numbers[index]);
                        break;
				}
				operators[i]++;
			}
		}
	}
}
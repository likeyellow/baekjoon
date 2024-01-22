import java.util.Scanner;

class Main {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String command = sc.hasNext()? sc.next() : ""; // next(); 공백을 제외하고 다음에 오는 문자열을 받는다.
		
		
		boolean[][] passVertical = new boolean[N][N];
		boolean[][] passHorizontal = new boolean[N][N];
		int curR = 0, curC = 0; 
		for(int i = 0; i < command.length(); i++) {
			char cmd = command.charAt(i);
			if(cmd == 'D') {
				if(curR == N-1) continue;
				passVertical[curR][curC] = true;
				passVertical[curR +1][curC] = true;
				curR++;
			}
			else if(cmd == 'U') {
				if(curR == 0) continue;
				passVertical[curR][curC] = true;
				passVertical[curR -1][curC] = true;
				curR--;
			}
			else if(cmd == 'L') {
				if(curC == 0) continue;
				passHorizontal[curR][curC] = true; // 지금 내가 있는 곳에서 수평방향으로 이동
				passHorizontal[curR][curC-1] = true; // 다음칸으로 이동후 흔적 남김
				curC--;
			}
			else {
				if(curC == N-1) continue; // 제일 오른쪽칸이 수평이동의 마지막
				passHorizontal[curR][curC] = true;
				passHorizontal[curR][curC+1] = true;
				curC++;
			}
		}
		for(int i = 0; i<N; i++) {
			String ans = "";
			for(int j=0; j < N; j++) {
				if(passVertical[i][j] && passHorizontal[i][j]) ans += "+";
				else if (passVertical[i][j]) ans += "|";
				else if (passHorizontal[i][j]) ans += "-";
				else ans += ".";
			}
			System.out.println(ans);
		}
	}

}
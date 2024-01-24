import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 0. 이름과 출입기록 입력 받음
        String[][] members = new String[n][2];
        for(int i = 0; i < n; i++){
            members[i][0] = sc.next();
            members[i][1] = sc.next();
        }
        // 1. 같은 이름끼리 모아서 이름 역순으로 정렬
        Arrays.sort(members, new Comparator<String[]>() {
            public int compare(String[] m1, String[] m2) {
                return m2[0].compareTo(m1[0]);
            }
        });
        // 2. 출입기록 "enter"만 남기기
        for(int i = 0; i < n-1; i++)
            if(!members[i][0].equals(members[i+1][0]) && members[i][1].equals("enter"))
                // 현재 회사에 있는 사람의 이름을 사전 순의 역순으로 한 줄에 한 명씩 출력
                System.out.println(members[i][0]);
        if(members[n-1][1].equals("enter"))
            System.out.println(members[n-1][0]);
    }
}
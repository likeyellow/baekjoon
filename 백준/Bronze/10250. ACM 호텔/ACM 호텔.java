import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            
            int distance = (N-1)/H +1;
            int floor = (N-1)%H +1;
            System.out.printf("%d%02d\n", floor, distance);
        }
    }
}
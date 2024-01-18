import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i =0; i < N; i++)
            nums[i] = sc.nextInt();
        
        int X = sc.nextInt();
        
        boolean[] exist = new boolean[1000001];
        for(int i =0; i < N; i++)
            exist[nums[i]] = true;
        
        int result = 0;
        for(int i=1; i <= (X-1)/2; i++) {
            if(i <= 1000000 && X-i <= 1000000)
                result += (exist[i] && exist[X-i]) ? 1:0;
        }
        System.out.println(result);    
    }
}
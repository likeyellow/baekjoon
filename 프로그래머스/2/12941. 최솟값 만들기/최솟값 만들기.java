import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        //Integer []aa = Arrays.stream(A).boxed().toArray(Integer[]::new);
        //Integer []bb = Arrays.stream(B).boxed().toArray(Integer[]::new);
        
        Arrays.sort(A);
        Arrays.sort(B);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println(Arrays.toString(aa));
        //System.out.println(Arrays.toString(bb));
        
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }
        return answer;
    }
}
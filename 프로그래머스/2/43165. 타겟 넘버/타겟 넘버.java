class Solution {
    private static int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        backtrack(numbers, target, 0, 0);
        return answer;
    }
    
    private static void backtrack(int[] numbers, int target, int index, int sum) {
        if(index == numbers.length) {
            if(sum == target) {
                answer++;
            }
            return;
        }
        backtrack(numbers, target, index+1, sum + numbers[index]);
        backtrack(numbers, target, index+1, sum - numbers[index]);
    }
}
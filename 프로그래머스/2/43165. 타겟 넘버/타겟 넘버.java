class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    private void dfs(int[] numbers, int target, int depth,  int sum) {
        // 모든 숫자를 다 사용했을 때
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        
        //현재 숫자 더하는 경우
        dfs(numbers, target, depth + 1, sum + numbers[depth]);
        
        // 현재 숫자를 빼는 경우
        dfs(numbers, target, depth + 1, sum - numbers[depth]);
    }
}
class Solution {
    public long solution(int n) {
        // n칸까지 방법 수 담을 배열
        long[] dp = new long[n + 1];
        
        dp[0] = 1; // 0칸일 때도 1가지 방법(아무것도 안함)
        dp[1] = 1; // 1칸일 때도 1가지 방법
        
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        
        return dp[n];
    }
}
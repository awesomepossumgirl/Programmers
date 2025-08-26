class Solution {
    public int solution(int n) {
        // n 번째 피보나치수 % 1234567
        
        int MOD = 1234567;
        int a = 0, b = 1; // F(0), F(1)
        
        for (int i = 2; i <= n; i++) {
            int sum = (a + b) % MOD;
            a = b;
            b = sum;
        }
        
        return n == 0 ? a : b;
    }
}
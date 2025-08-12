class Solution {
    public long solution(long n) {
         long x = (long) Math.sqrt(n); // n 제곱근 구하기
        
        if (x * x == n) { // n이 완전제곱수인가?
             return (x + 1) * (x + 1);
        } else {
            return -1;
        }
    }
}
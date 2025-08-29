/* class Solution {
    public int solution(int n) {
        return Integer.bitCount(n); // n의 이진수에서 1의 개수
    }
} */
class Solution {
    public int solution(int n) {
        int battery = 0;
        
        while (n > 0) {
            if ((n & 1) == 0) { // 짝수면 순간이동 역추적
                n >>= 1;
            } else { // 홀수면 점프 1칸 역추적
                n -= 1;
                battery++;
            }
        }
        return battery;
    }
}
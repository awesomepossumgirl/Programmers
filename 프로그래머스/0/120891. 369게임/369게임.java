class Solution {
    public int solution(int order) {
        
        int cnt = 0;
        
        while (order > 0) {
            // 마지막 자릿수
            int digit = order % 10;
            
            // 3, 6, 9일 때 박수
            if (digit == 3 || digit == 6 || digit == 9) {
                cnt++;
            }
            
            // 마지막 자릿수 제거
            order /= 10;
        }
        return cnt;
    }
}
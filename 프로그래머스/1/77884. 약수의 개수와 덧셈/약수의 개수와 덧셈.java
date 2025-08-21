class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int cnt = 0; // 위치 중요 for문 바깥이면 i 초기화 안됨
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
}
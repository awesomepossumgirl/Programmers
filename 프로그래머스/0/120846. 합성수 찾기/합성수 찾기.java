class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 4; i <= n; i++) { // 1, 2, 3은 합성수가 아니므로 4부터 시작
            int cnt = 0;
            
            // i의 약수 개수 세기
            /*
            j = 1부터 j = i까지 j를 증가시키면서 i % j == 0이면 cnt++ 증가
            즉, i를 1부터 i까지 나누면서 나누어떨어지는 개수를 세는 방식
            */
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            // 약수 개수가 3개 이상이면 합성수
            if (cnt >= 3) {
                answer++;
            }
        }
        
        return answer; // 메서드 블록 내에서 return
    }
}

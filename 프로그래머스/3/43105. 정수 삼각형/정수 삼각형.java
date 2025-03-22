import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int height = triangle.length; // 삼각형의 높이
        int[][] dp = new int[height][height]; // 합을 저장할 DP 배열

        // 1. 첫 번째 줄 (맨 꼭대기 값)
        dp[0][0] = triangle[0][0];

        // 2. 첫 번째 열 채우기 (맨 왼쪽 경로)
        for (int i = 1; i < height; i++) {
            dp[i][0] = dp[i - 1][0] + triangle[i][0];
        }

        // 3. DP 배열 채우기 (왼쪽 위, 위쪽 비교)
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < triangle[i].length; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
            }
        }

        // 4. 최댓값 찾기 (마지막 행에서 최댓값)
        int answer = 0;
        for (int i = 0; i < height; i++) {
            answer = Math.max(answer, dp[height - 1][i]);
        }

        return answer;
    }
}

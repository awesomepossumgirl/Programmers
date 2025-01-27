class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        
        // n+1 크기의 2차원 배열 선언 (0번 인덱스는 사용하지 않음)
        int[][] floyd = new int[n + 1][n + 1];

        // 게임 결과를 기반으로 승패 정보 입력
        for (int i = 0; i < results.length; i++) {
            int A = results[i][0];
            int B = results[i][1];
            
            // A가 B를 이긴 경우
            floyd[A][B] = 1;
            floyd[B][A] = -1;
        }
        
        // 플로이드 워셜 알고리즘을 사용하여 간접적인 승패 관계를 찾음
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    // i가 k를 이기고, k가 j를 이기면 i가 j를 이긴다고 확정
                    if (floyd[i][k] == 1 && floyd[k][j] == 1) {
                        floyd[i][j] = 1;
                        floyd[j][i] = -1;
                    }
                    // i가 k에게 졌고, k가 j에게 졌으면 i가 j에게 진다고 확정
                    else if (floyd[i][k] == -1 && floyd[k][j] == -1) {
                        floyd[i][j] = -1;
                        floyd[j][i] = 1;
                    }
                }
            }
        }

        // 각 선수에 대해, 다른 선수들과의 승패 결과가 모두 확정되었는지 확인
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                if (floyd[i][j] != 0) {
                    cnt++;
                }
            }
            // n-1명과 승패가 확정되었다면, 순위를 확정할 수 있는 선수
            if (cnt == n - 1) {
                answer++;
            }
        }

        return answer;  // 순위를 확정할 수 있는 선수의 수를 반환
    }
}
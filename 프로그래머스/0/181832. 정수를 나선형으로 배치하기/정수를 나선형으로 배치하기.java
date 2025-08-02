class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        // 방향 : 오른쪽→ 아래↓ 왼쪽← 위↑
        int[] dx = {0, 1, 0, -1}; // 행 이동
        int[] dy = {1, 0, -1, 0}; // 열 이동
        
        int x = 0, y = 0; // 시작 위치
        int dir = 0; // 현재 방향 인덱스
        int num = 1;
        
        for (int i = 0; i < n * n; i++) {
            answer[x][y] = num++;
            
            // 다음 위치 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            // 벽에 부딪히거나 이미 채운 곳이면 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= n ||
                answer[nx][ny] != 0) {
                dir = (dir + 1) % 4; // 방향 전환 (0 1 2 3 0 순환)
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            // 위치 이동
            x = nx;
            y = ny;
        }
        
        return answer;
    }
}
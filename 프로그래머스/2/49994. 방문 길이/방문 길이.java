class Solution {
    // 순서 왼쪽 → 아래 → 오른쪽 → 위
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    public int solution(String dirs) {
        int x = 5, y = 5, d = 0;
        int answer = 0;
        // 0 : 위, 1 : 우, 2 : 하, 3 : 좌
        // 칸(cell)이 아니라 점(node) 기준이라 11 * 11
        // 마지막 칸은 어디로부터 이동했는지 체크하는 것
        boolean[][][] visited = new boolean[11][11][4]; 
        
        for (char c : dirs.toCharArray()) {
            if (c == 'U') d = 0;
            if (c == 'R') d = 1;
            if (c == 'D') d = 2;
            if (c == 'L') d = 3;
            
            int ny = y + dy[d];
            int nx = x + dx[d];
            if (ny < 0 || ny >= 11 || nx < 0 || nx >= 11) continue;
            if (!visited[ny][nx][d]) {
                visited[ny][nx][d] = true;
                visited[y][x][(d + 2) % 4] = true;
                answer++;
            }
            x = nx;
            y = ny;
        }
        
        return answer;
    }
}
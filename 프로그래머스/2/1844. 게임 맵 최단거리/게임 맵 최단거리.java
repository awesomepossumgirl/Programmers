import java.util.*;

class Solution {
    
    static class Point {
        int x,y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        // 방향 배열 (상, 하, 좌, 우)
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        
        // BFS로 거리 누적하기 (여기서 시작점 1로 잡음)
        // maps 배열에 거리 값 직접 지정
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                
                // 맵 범위 확인
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                
                // 길이고 아직 방문하지 않은 경우
                if (maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[p.x][p.y] + 1; // 거리 누적
                    queue.add(new Point(nx, ny));
                }
            }
        }
        
        return maps[n-1][m-1] == 1 ? -1 : maps[n-1][m-1];
    }
}
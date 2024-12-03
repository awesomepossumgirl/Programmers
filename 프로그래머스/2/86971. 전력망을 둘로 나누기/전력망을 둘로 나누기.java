import java.util.*;

class Solution {
    
    private static boolean[] visited;
    private static ArrayList<Integer>[] adjList;
    private static int N, answer;
    
    public int solution(int n, int[][] wires) {
        N = n;
        answer = n - 1;
        
        // 전선 연결 정보 저장할 인접 리스트 초기화
        adjList = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }
        
        // 전선 연결 정보를 연결 리스트에 저장
        for (int[] wire : wires) {
            adjList[wire[0]].add(wire[1]);
            adjList[wire[1]].add(wire[0]);
        }
        
        visited = new boolean[n + 1];
        //깊이 우선 탐색 시작
        dfs(1);
        return answer;
    }
    
    private static int dfs(int now) {
        visited[now] = true;
        int sum = 0;
        
        // 연결된 모든 전선을 확인
        for (int next : adjList[now]) {
            if (!visited[next]) {
                // (전체 노드 - 자식트리의 노드 수) - (자식트리의 노드 수)
                // 의 절대값이 가장 작은 값 구하기
                int cnt = dfs(next);
                answer = Math.min(answer, Math.abs(N - cnt * 2));
                sum += cnt;
            }
        }
        // 전체 자식 노드의 수에 1(현재 now 노드)을 더해서 반환
        return sum + 1;
    }
}
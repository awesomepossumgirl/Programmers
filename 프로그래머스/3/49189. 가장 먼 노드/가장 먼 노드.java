import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        // 그래프 초기화 (0번 노드는 사용하지 않음)
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // 간선 정보 반복문으로 추가
        for (int[] e : edge) {
            int a = e[0];
            int b = e[1];
            graph.get(a).add(b); // a번 노드와 b번 노드 연결
            graph.get(b).add(a); // b번 노드와 a번 노드 연결 (양방향)
        }
        
        // 거리 배열과 방문 여부 배열 초기화
        int[] distance = new int[n + 1]; // 거리 배열
        boolean[] visited = new boolean[n + 1]; // 방문 여부 배열
        visited[1] = true; // 1번 노드는 시작 노드로 방문 처리
        
        // BFS를 위한 큐 생성 (q로 변수명 변경)
        Queue<Integer> q = new LinkedList<>();
        q.add(1); // 시작 노드 1번을 큐에 추가
        
        // BFS 탐색
        while (!q.isEmpty()) {
            int nowNode = q.poll(); // 현재 노드 꺼내기
            List<Integer> nodeList = graph.get(nowNode); // 현재 노드와 연결된 노드들
            
            // 연결된 노드들 탐색
            for (int nextNode : nodeList) {
                if (!visited[nextNode]) { // 방문하지 않은 노드일 경우
                    q.add(nextNode); // 큐에 추가
                    visited[nextNode] = true; // 방문 처리
                    distance[nextNode] = distance[nowNode] + 1; // 거리 갱신
                }
            }
        }
        
        // 가장 먼 거리값 찾기
        int maxDistance = Arrays.stream(distance).max().getAsInt();
        
        // 가장 먼 거리의 노드 개수 세기
        for (int dist : distance) {
            if (dist == maxDistance) {
                answer++;
            }
        }
        
        return answer;
    }
}

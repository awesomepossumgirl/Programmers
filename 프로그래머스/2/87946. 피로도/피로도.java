class Solution {
    // 전역 변수 선언
    public static int answer; // 최대 던전 탐험 횟수
    public static boolean[] visited; // 각 던전의 방문 여부
        
    // 문제 답 반환하는 메서드
    public int solution(int k, int[][] dungeons) {
        answer= 0; // 초기값 설정
        visited = new boolean[dungeons.length]; // 방문 여부 배열 초기화
        
        // 백트래킹 탐색 시작
        // (현재 탐험 깊이 0, 초기 피로도 k, 던전 정보 전달)
        backTracking(0, k, dungeons);
        return answer;
    }
        
    // 백트래킹 메서드: 가능한 모든 던전 탐험 경로를 탐색
    public static void backTracking(int depth, int k, int[][] dungeons) {
        // 던전 목록 순회
        for (int i = 0; i < dungeons.length; i++) {
            
            // 조건 1: 아직 방문하지 않은 던전
            // 조건 2: 현재 피로도(k)가 해당 던전 탐험 최소 요구 피로도(dungeons[i][0]) 이상
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true; // 해당 던전을 방문 표시
                
                // 재귀 호출: 현재 던전을 탐험한 상태로 탐색 계속
                backTracking(depth + 1, k - dungeons[i][1], dungeons);
                
                // 백트래킹: 탐험을 되돌려 다음 경로를 탐색할 수 있도록 초기화
                visited[i] = false;
            }
        }
        // 현재까지의 탐험 깊이를 최대값으로 갱신
        answer = Math.max(answer, depth);  
    }
}
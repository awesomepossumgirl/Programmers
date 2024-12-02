import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
    
    	// 내림차순 큐 선언
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int cnt = 0;
        
        // 큐에 우선순위를 삽입
        for (int i : priorities) {
            queue.offer(i);
        }
        
        // 우선순위 큐와 배열을 순회하며 처리
        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                // 큐의 가장 높은 우선순위와 배열의 현재 값을 비교
                if (queue.peek() == priorities[i]) {
                    queue.poll(); // 우선순위 큐에서 제거
                    cnt++; // 프로세스 순서 증가
                    
                    // 찾고 있는 프로세스가 현재 프로세스이면 cnt 반환
                    if (location == i) {
                        return cnt;
                    }
                }
            }
        }
        return cnt;
    }
}
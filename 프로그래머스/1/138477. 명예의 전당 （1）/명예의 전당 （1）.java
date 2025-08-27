import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소 힙
        
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]); // 오늘 점수 추가
            
            // k개 넘으면 가장 낮은 점수 제거
            if (pq.size() > k) {
                pq.poll();
            }
            
            // 현재 명예의 전당에서 가장 낮은 점수 
            answer[i] = pq.peek();
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        // 사고ㅏ몇 박스 ? score.length / m;
        // 각 사과 점수 계산 
        int len = score.length; // 사과박스 
        int box = len / m; // 점수 길이 
        int answer = 0; // 최대이익
        
        // 사과점수 내림차순
        // int[] → Integer[]로
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        
        // m 개씩 묶어서 박스 가격 계산
        for (int i = 0; i < len / m; i++) {
            int start = i * m; // 아 이렇게 하면 되는구나
            int end = start + m - 1; // 박스 끝 인덱스
            int minScore = arr[end]; // 내림차순이라 제일 작은 값은 마지막 원소
            answer += minScore * m; 
        }
        
        return answer;
    }
}
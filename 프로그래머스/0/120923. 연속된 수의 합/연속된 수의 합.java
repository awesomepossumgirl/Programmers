import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        // 시작값 : (총합 - 개수의 중간값 합) / 개수
        int start = total / num - (num - 1) / 2; 
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}
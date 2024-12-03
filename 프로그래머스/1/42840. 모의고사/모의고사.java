import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = {0, 0, 0};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % 5]) scores[0]++;
            if (answers[i] == second[i % 8]) scores[1]++;
            if (answers[i] == third[i % 10]) scores[2]++;
        }
        
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (max == scores[i]) list.add(i + 1); // 인덱스를 사람 번호로 변환
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

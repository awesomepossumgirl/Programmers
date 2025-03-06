import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> oddNumbers = new ArrayList<>();
        
        // 1~n까지 숫자 중에서 홀수만 추가하기
        for (int i = 1; i <= n; i+=2) {
            oddNumbers.add(i);
        }
        
        // list 를 Array로 변환
        int[] answer = new int[oddNumbers.size()];
        for( int i = 0; i < oddNumbers.size(); i++) {
            answer[i] = oddNumbers.get(i);
        }
        return answer;
    }
}
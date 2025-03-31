import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        
        // n과 배열 첫번째 요소의 차이의 절대값으로 설정
        int min = Math.abs(n - array[0]);
        // 처음에는 배열 첫번째 값으로 설정
        int answer = array[0];
        
        for(int i = 1 ; i < array.length; i++) {
            int minus = Math.abs(n - array[i]); // n - array[i] 의 절대값
            
            // 절대값이 더 작은 경우
            if (minus < min) {
                min = minus; // 더 작은 차이로 갱신
                answer = array[i]; // 해당 값 변수에 넣기
           
            } else if (minus == min ){ // 차이 같으면 더 작은 값 선택
                answer = Math.min(answer, array[i]);
            }
        }
        return answer;
    }
}
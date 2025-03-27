/* 
import java.util.*;
 
class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(c - '0'); // 문자 → 숫자로 변환
            }
        }
        
        Collections.sort(numbers); // 오름차순 정렬
        return numbers;
    }
}
*/

import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        char[] arr = my_string.toCharArray();
        
        // 숫자의 개수를 세어 int[] 배열을 만들기 위한 준비
        int count = 0;
        for (char c : arr) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        
        // 숫자의 개수만큼 크기를 가지는 int[] 배열 생성
        int[] answer = new int[count];
        int index = 0;
        
        // 숫자만 answer 배열에 추가
        for (char c : arr) {
            if (Character.isDigit(c)) {
                answer[index++] = Integer.parseInt(String.valueOf(c));
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
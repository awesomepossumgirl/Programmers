import java.util.*;

class Solution {
    public String solution(String my_string) {
        // 1. 모두 소문자로 변환
        // toLowerCase()는 문자열을 변경하지 않고 새 문자열을 반환
        // String은 immutable이기 때문에 my_string.toLowerCase();만 호출하면 아무 변화 없음
        my_string = my_string.toLowerCase();
        
        // 2. 문자 배열로 변환
        char[] chars = my_string.toCharArray();
        
        // 3. 문자 배열 정렬
        Arrays.sort(chars);
        
        // 4. 정렬된 문자 배열을 문자열로 변환
        return new String(chars);
        
    }
}
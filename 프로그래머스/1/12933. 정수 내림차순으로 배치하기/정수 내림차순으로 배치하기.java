import java.util.Arrays;

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        // 숫자 → 문자열 → char 배열
        char[] numArray = Long.toString(n).toCharArray();
        // 오름차순 정렬
        Arrays.sort(numArray);
        // 뒤에서부터 내림차순으로 붙이기
        for (int i = numArray.length - 1; i >= 0; i--) {
            sb.append(numArray[i]);
        }
        
        // 다시 long 타입으로 변환
        return Long.parseLong(sb.toString());
    }
}
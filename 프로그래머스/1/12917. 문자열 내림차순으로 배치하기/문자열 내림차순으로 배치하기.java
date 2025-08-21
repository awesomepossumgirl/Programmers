import java.util.*;

class Solution {
    public String solution(String s) {
        char[] str = s.toCharArray();
        Arrays.sort(str);
        
        // 내림차순으로 뒤집기
        for (int i = 0; i < str.length / 2; i++) {
            char temp = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = temp;
        }
        
        return new String(str); // str.toString(); x
    }
}
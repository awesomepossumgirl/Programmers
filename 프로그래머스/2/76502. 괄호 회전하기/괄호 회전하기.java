import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (isValid(rotated)) answer++;
        }
        
        return answer;
    }
    
    public boolean isValid(String str) {
        Stack<Character> isValid = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || 
                str.charAt(i) == '[' || 
                str.charAt(i) == '{' ) {
                isValid.push(str.charAt(i));
            } else {
                // 닫는 괄호일 때
                if (isValid.isEmpty()) return false;
                
                char top = isValid.pop();
                if (str.charAt(i) == ')' && top != '(') return false;
                if (str.charAt(i) == ']' && top != '[') return false;
                if (str.charAt(i) == '}' && top != '{') return false;
            }
        }
        
        // 모두 처리하고 나서 스택이 비어있으면 올바른 괄호 문자열
        return isValid.isEmpty();
    }
}
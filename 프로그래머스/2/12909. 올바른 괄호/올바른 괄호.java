import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> cnt = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                cnt.push('(');
            } else if(s.charAt(i) == ')') {
                if(cnt.isEmpty()) {
                    return false;
                }
                cnt.pop();
            } 
        }
        return cnt.isEmpty();
    }
}

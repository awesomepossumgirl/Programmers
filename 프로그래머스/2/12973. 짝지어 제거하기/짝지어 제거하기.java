import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) { // 스택이 비어있지 않고
                stack.pop(); // 같은 문자가 연속 2번 나오면 제거
            } else {
                stack.push(c);
            }
        }
        
        // 스택 비어 있으면 짝수쌍임
        return stack.isEmpty() ? 1 : 0;
        
    }
}
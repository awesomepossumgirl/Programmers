import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> s = new LinkedHashSet<>();
        for (char c : my_string.toCharArray()) {
            if (s.add(c)) { // 중복이 아니라면 추가
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
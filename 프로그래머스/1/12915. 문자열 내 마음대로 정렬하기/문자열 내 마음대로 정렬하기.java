import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 문자가 같으면 사 전순 비교
                if (s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2);
                } else {
                    return Character.compare(s1.charAt(n), s2.charAt(n));
                }
            }
        });
        
        return strings;
    }
}
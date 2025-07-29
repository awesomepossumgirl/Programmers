/*
import java.util.*;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
                     .filter(s -> !s.isEmpty())
                     .sorted()
                     .toArray(String[]::new);
    }
}
*/
import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // 1. "x" 기준으로 자르기
        String[] splited = myString.split("x");
        
        // 2. 빈 문자열 제거
        List<String> list = new ArrayList<>();
        for (String s : splited) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        
        // 3. 정렬
        Collections.sort(list);
        
        // 4. list → int[]
        return list.toArray(new String[0]);
    }
}
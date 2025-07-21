import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            answer.add(my_string.substring(i));
        }
        // 사전순 정렬
        Collections.sort(answer);

        // ArrayList<String> → String[] 변환
        return answer.toArray(new String[0]);
    }
}
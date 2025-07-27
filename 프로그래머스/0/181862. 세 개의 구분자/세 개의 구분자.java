import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        // 정규표현식 a,b,c 기준으로 분리
        String[] splited = myStr.split("[abc]");
        
        // 빈 문자열 제거하기
        List<String> list = new ArrayList<>();
        for (String s : splited) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        
        // 결과 비어있는 경우 return "EMPTY"
        if (list.isEmpty()) {
            return new String[]{"EMPTY"};
        }
        
        return list.toArray(new String[0]);
    }
}
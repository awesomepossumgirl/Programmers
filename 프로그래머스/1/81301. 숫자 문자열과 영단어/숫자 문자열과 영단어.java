import java.util.*;

class Solution {
    public int solution(String s) {
        // HashMap에 숫자랑 영단어 담기
        // 한 마디로 노가다 문제
        HashMap<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven","7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        
        // 맵에 있는 키를 실제 숫자 문자열로 치환하기
        for (String key : map.keySet()) {
            s = s.replaceAll(key, map.get(key));
        }
        
        return Integer.parseInt(s);
    }
}
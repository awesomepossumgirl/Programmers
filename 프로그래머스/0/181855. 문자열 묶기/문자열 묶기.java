import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        // 문자열 길이 key
        Map<Integer, Integer> lenCnt = new HashMap<>();
        
        for (String s : strArr) {
            int len = s.length();
            lenCnt.put(len, lenCnt.getOrDefault(len, 0) + 1);
        }
        
        // 제일 큰 그룹 크기
        int max = 0;
        for (int cnt : lenCnt.values()) {
            max = Math.max(max, cnt);
        }
        
        return max;
    }
}
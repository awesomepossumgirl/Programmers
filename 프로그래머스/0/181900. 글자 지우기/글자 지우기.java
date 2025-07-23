import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        // 인덱스 빠르게 검사하기 위해서 Set을 씀
        Set<Integer> indexSet = new HashSet<>();
        for (int idx : indices) {
            indexSet.add(idx);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            if (!indexSet.contains(i)) { // 제외할 인덱스가 아니라면
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}
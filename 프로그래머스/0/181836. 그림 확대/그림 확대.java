import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        
        for (String row : picture) {
            StringBuilder enlargedRow = new StringBuilder();
            
            // 가로 확대
            for (char ch : row.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    enlargedRow.append(ch);
                }
            }
            
            // 세로 확대
            for (int i = 0; i < k; i++) {
                list.add(enlargedRow.toString());
            }
        }
        
        return list.toArray(new String[0]);
    }
}
import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> usedWords = new HashSet<>();
        usedWords.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            // 끝말 맞는지 확인
            String prev = words[i - 1];
            String curr = words[i];
            
            if (usedWords.contains(curr) || prev.charAt(prev.length() - 1) != curr.charAt(0)) {
                int player = (i % n) + 1;
                int turn = (i / n) + 1;
                return new int[]{player, turn};
            }
            
            usedWords.add(curr);
        }
        
        return new int[]{0, 0};
    }
}
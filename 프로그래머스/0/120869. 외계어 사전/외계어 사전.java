import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell의 문자를 하나씩 이어 붙여서 String으로 변환후
        // 다시 char[] 타입 배열로 만들기
        char[] spellToChars = String.join("", spell).toCharArray();
        // 문자 타입 배열 정렬
        Arrays.sort(spellToChars);
        // 문자 배열을 String으로 변환
        String sortedSpell = new String(spellToChars);
        
        // dic 배열의 각 단어 검사
        for (String word : dic) {
            // 길이가 같지 않으면 건너뛴다.
            if (word.length()!= spell.length) continue;
            // 각 단어를 문자 정렬한다.
            char[] wordToChar = word.toCharArray();
            Arrays.sort(wordToChar);
            String sortedWord = new String(wordToChar);
            // 정렬된 문자열이 같다면 1 반환
            if (sortedWord.equals(sortedSpell)) return 1;
        }
        return 2;
    }
}
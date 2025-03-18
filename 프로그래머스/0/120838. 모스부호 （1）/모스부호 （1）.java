import java.util.*;
    
class Solution {
    public String solution(String letter) {
        Map<String, String> morse = new HashMap<>();
        // 모스 부호 매핑
        morse.put(".-", "a"); morse.put("-...", "b"); 
        morse.put("-.-.", "c"); morse.put("-..", "d");
        morse.put(".", "e"); morse.put("..-.", "f"); 
        morse.put("--.", "g"); morse.put("....", "h");
        morse.put("..", "i"); morse.put(".---", "j"); 
        morse.put("-.-", "k"); morse.put(".-..", "l");
        morse.put("--", "m"); morse.put("-.", "n"); 
        morse.put("---", "o"); morse.put(".--.", "p");
        morse.put("--.-", "q"); morse.put(".-.", "r"); 
        morse.put("...", "s"); morse.put("-", "t");
        morse.put("..-", "u"); morse.put("...-", "v"); 
        morse.put(".--", "w"); morse.put("-..-", "x");
        morse.put("-.--", "y"); morse.put("--..", "z");
        
        // 공백 기준으로 나누기
        String[] words = letter.split(" ");
        
        // 문자 조합
        StringBuilder sb = new StringBuilder();
        for (String word : words ) {
            sb.append(morse.get(word));
        }
        return sb.toString();
        
    }
}
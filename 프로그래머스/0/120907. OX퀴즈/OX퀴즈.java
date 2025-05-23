import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0; i < quiz.length; i++) {
            // 공백 기준으로 수식 분리
            String [] splited = quiz[i].split(" ");
            int x = Integer.parseInt(splited[0]);
            String op = splited[1];
            int y = Integer.parseInt(splited[2]);
            int result = Integer.parseInt(splited[4]);
            
            int calculated = 0;
            if (op.equals("+")) {
                calculated = x + y;
            } else if (op.equals("-")) {
                calculated = x - y;
            }
            
            // 비교 결과
            answer.add((calculated == result) ? "O" : "X");
        }
        return answer.toArray(new String[0]);
    }
}
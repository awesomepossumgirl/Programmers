import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        // 발음 가능한 단어 목록
        String[] canSay = {"aya", "ye", "woo", "ma"};
        int cnt = 0;
        
        for (String word : babbling) {
            String temp = word; // 현재 단어 복사
            String prev = ""; // 직전에 사용한 발음 저장
            boolean isValid = true; // 유효한 단어인가? 
            Set<String> used = new HashSet<>(); // 이미 사용한 발음인지 확인
            
            // temp가 비어 있을 때까지 앞에서부터 발음 매칭
            while (!temp.isEmpty()) {
                boolean matched = false; // 현재 반복에서 발음이 매칭되었는지 판단
                
                // 가능한 발음 목록 순회하기
                for (String say : canSay) {
                    // 현재 단어가 say로 시작하고, 이전에 사용한 적 없는 발음이면 
                    if (temp.startsWith(say) && !used.contains(say)) {
                        temp = temp.substring(say.length()); // 해당 발음 부분 제거
                        used.add(say); // 사용한 발음으로 등록
                        matched = true; // 매칭 성공
                        break; // 더이상 다른 발음 확인할 필요 없음
                    }
                }
                // 어떤 발음도 매칭되지 않으면 유효하지 않은 단어로 처리
                if (!matched) {
                    isValid = false;
                    break;
                }
            }
            // 모든 조건을 통과하고 temp가 완전히 비워졌으면 유효한 단어
            if (isValid) cnt++;
        }
        return cnt;
    }
}
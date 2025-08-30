import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        // HashMap에 원하는 제품, 수량 담기
        HashMap<String, Integer> wantMap = new HashMap<>(); 
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        // 해시맵에 discount를 10일씩 잘라서 discountMap 에 저장하기
        // wantMap이랑 비교하기 어떻게 짜지...
        
        // Sliding Window
        // 슬라이딩 윈도우란?
        // 왜 <= discount.length - 10인지
        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> discountMap = new HashMap<>();
            
            // 1부터 10개 물품 세기
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            
            // wantMap이랑 discountMap 비교하기
            // 이번 구간은 조건 만족한다 가정
            boolean valid = true;
            // 현재 10일짜리 할인 구간이 회원이 원하는 모든 상품 조건을 만족하는지 검사하기
            for (String key : wantMap.keySet()) { // 정현이가 원하는 상품 하나씩 꺼내오기
                // 현재 10일 구간에서 나온 상품개수 가져오기, 없응면 0 반환
                // 현재 구간에서 회원이 원하는 상품 개수 가져오기, 없으면 0 반환
                // 현재 구간에서 필요한 개수보다 적으면 실패
                if (discountMap.getOrDefault(key, 0) < wantMap.getOrDefault(key, 0)) {
                    valid = false;
                    break;
                }
            }
            
            // 정답 만족된 구간이면 answer 1 증가
            if (valid) answer++;
        }
        
        return answer;
    }
}
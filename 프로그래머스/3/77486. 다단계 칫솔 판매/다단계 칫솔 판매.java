import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        
        Map<String, String> parentMap = new HashMap<>(); // <나, parent>
        Map<String, Integer> memberIndexMap = new HashMap<>(); // <나, index>
        
        for (int i = 0; i < enroll.length; i++) {
            parentMap.put(enroll[i], referral[i]);
            memberIndexMap.put(enroll[i], i);
        }
        
        for (int i = 0; i < seller.length; i++) {
            String curSeller = seller[i]; // parent에 넘길 금액
            int profit = 100 * amount[i]; // 내가 가져갈 수익금
            
            while(!curSeller.equals("-")) { // 루트가 "-"이면 더 이상 parent가 없으니 종료
                // 내 index에 이익금 누적합산
                int profitForParent = profit / 10;
                int myProfit = profit - profitForParent;

                // 자신의 index에 금액만큼 더함
                answer[memberIndexMap.get(curSeller)] += myProfit;

                // parent 노드로 이동하며 수익을 부모에게 넘긴 금액으로 초기화
                curSeller = parentMap.get(curSeller);
                profit /= 10;

                // 이익금이 1원 미만인 경우
                if (profit < 1) {
                    break;
                }    
            }
        }
        
        return answer;
    }
}
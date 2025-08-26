import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        Map<String, Member> memberMap = new HashMap<>();
        
        // 1. 모든 멤버 key값 생성
        for (String name : enroll) {
            memberMap.put(name, new Member(name));
        }
        
        // 2. parent 연결
        for (int i = 0; i < enroll.length; i++) {
            String name = enroll[i];
            String parentName = referral[i];
            if (!parentName.equals("-")) {
                // 추천인이 없을 경우 "-"
                memberMap.get(name).setParent(memberMap.get(parentName));
            }
        }
        
        // 3. 판매 발생 처리
        for (int i = 0; i < seller.length; i++) {
            String name = seller[i];
            int profit = amount[i] * 100;
            memberMap.get(name).addProfit(profit);
        }
        
        // 4. 결과 배열 만들기
        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = memberMap.get(enroll[i]).getProfit();
        }
     
    
        return answer;
    }
}

class Member {
    private final String name;
    private Member parent;
    private int profit;
    
    public Member(String name) {
        this.name = name;
        this.profit = 0;
    }
    
    public void setParent(Member parent) {
        this.parent = parent;
    }
    
    public void addProfit(int money) {
        int giveToParent = money / 10;
        this.profit += money - giveToParent;
        
        if (parent != null && giveToParent > 0) {
            parent.addProfit(giveToParent);
        }
    }
    
    public int getProfit() {
        return profit;
    }
}
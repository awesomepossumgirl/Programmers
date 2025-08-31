class Solution {
    public int solution(int number, int limit, int power) {
        // 번호의 약수 개수에 해당하는 공격력
        // 단, 제한 수치 limit 넘어가면 power 구매
        // limit = 공격력일 때는 limit 구매 가능
        // 공격력 1당 철 1kg 
        // 모든 무기 만들기 위해 필요한 철의 무게 리턴
        
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int paladinNum = i; // 기사 번호 
            int attackCnt = divisorCnt(i);
            if (attackCnt > limit) {
                answer += power;
            } else {
                answer += attackCnt;
            }
        }
        
        return answer;
    }
    
    public int divisorCnt(int n) { // pladinNum의 공격력 약수 계산하는 메서드
        int attack = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                attack++;
                if (i != n / i) attack++;
            }
        }
        
        return attack;    
    }
}
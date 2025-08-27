class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; // 받을 수 있는 콜라 개수
        int bottles = n; // 현재 빈병 개수
        
        while(bottles >= a) { // 병이 a가 이상이면 바꿀 수 있음
            int newCola = (bottles / a) * b; // 새로 받는 콜라
            answer += newCola;
            bottles = (bottles % a) + newCola; // 남은 병 + 새 콜라 마신 후 나온 빈 병
        }
        
        return answer;
    }
}
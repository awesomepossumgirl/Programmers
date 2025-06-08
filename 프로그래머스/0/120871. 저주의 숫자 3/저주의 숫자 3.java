class Solution {
    public int solution(int n) {
        int cnt = 0; // 지금까지 골라낸 3x 마을 숫자의 개수
        int num = 0;   // 검사할 숫자 (1부터 계속 증가)
        while(cnt < n) {
            num++; // 숫자를 하나씩 늘려가
            if(num%3 != 0 && !String.valueOf(num).contains("3")) {
                cnt++; // 이 숫자가 3의 배수도 아니고 3도 안들어가면 카운트
            }
        }
        return num; // n번째로 골라진 3x 마을 숫자!
    }
}
class Solution {
    public String solution(int a, int b) {
        // 2016 윤년 한 달 일수
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        // 1월 1일부터 입력한 날짜까지 총 일수 계산하기
        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += days[i];
        }
        totalDays += b; // 반복문 밖에서 이번달 일수 추가
        
        // 2016년 1월 1일 요일은 금요일(FRI)
        // 금요일(FRI, idx 5)
        // 그럼 (totalDays + ?) % 7 = 5가 되도록 계산하면?
        // (1 + ?) % 7 = 5;
        // ? = 4
        int dayOfWeek = (totalDays + 4) % 7;
        
        return week[dayOfWeek];
        
    }
}
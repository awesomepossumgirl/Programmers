import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate d1 = LocalDate.of(date1[0], date1[1], date1[2]); // 연, 월, 일
        LocalDate d2 = LocalDate.of(date2[0], date2[1], date2[2]);
        
        return d1.isBefore(d2) ? 1 : 0; // d1이 d2보다 이전이면1, 아니면 0 return
    }
}
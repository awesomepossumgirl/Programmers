import java.time.LocalDate;

class Solution {
    public int solution(int age) {
        return LocalDate.now().getYear() - age + -3 + 1;
    }
}
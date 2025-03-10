import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        double total = 0;
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        answer = total / numbers.length;
        return answer;
    }
}
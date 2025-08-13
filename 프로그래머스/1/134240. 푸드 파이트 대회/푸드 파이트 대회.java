import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] food) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(0);
        
        for (int i = food.length - 1; i >= 0; i--) {
            if (food[i] >= 2) {
                for (int j = 0; j < food[i]/2; j++) {
                    answer.add(i);
                    answer.add(0,i);
                }
            }
        }
        
        return answer.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> workDays = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((100.0-progresses[i]) / speeds[i]);
            workDays.add(days);
        }
        
        while(!workDays.isEmpty()) {
            int currentMax = workDays.poll();
            int cnt = 1; 
            while(!workDays.isEmpty() && workDays.peek() <= currentMax) {
                workDays.poll();
                cnt++;
            }
            answer.add(cnt);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
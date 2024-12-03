import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        
        PriorityQueue<Integer> maxq = new PriorityQueue<>((o1, o2) -> (o2 - o1));
        PriorityQueue<Integer> minq = new PriorityQueue<>();
        
        for(int i = 0; i < operations.length; i++ ) {
            String[] strs = operations[i].split(" ");
            int num = Integer.parseInt(strs[1]);
            
            if(strs[0].equals("I")) {
                maxq.add(num);
                minq.add(num);
            } else if(strs[0].equals("D") && num==1) {
                minq.remove(maxq.poll());
            } else if(strs[0].equals("D") && num==-1) {
                maxq.remove(minq.poll());
            }
        }
        
        int min = minq.isEmpty()? 0 : minq.poll(),
            max = maxq.isEmpty()? 0 : maxq.poll();
        
        return new int[] {max, min};
    }
}
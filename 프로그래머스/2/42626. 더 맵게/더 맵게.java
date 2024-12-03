import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int cnt = 0;
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        for (int s : scoville) {
            pqueue.add(s);
        }
        int min = pqueue.peek();
        while(min < K) {
            if(pqueue.size()>=2) {
                pqueue.add(pqueue.poll() + pqueue.poll() * 2);
                min = pqueue.peek();
                cnt++;
            } else {
                return -1;
            }
        }
        return cnt;
    }
}
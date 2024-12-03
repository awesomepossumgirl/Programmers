import java.util.PriorityQueue;
import java.util.Arrays;

class Solution {
    public int solution(int[][] jobs) {
        int sum = 0;
        // 요청시간으로 배열 오름차순 정렬
        Arrays.sort(jobs, (o1, o2) -> (o1[0] - o2[0]));
        // 소요시간으로 큐 오름차순 정렬
        PriorityQueue<int[]> q = new PriorityQueue<>((o1, o2) -> (o1[1] - o2[1]));
        
        int sec = 0;
        int idx = 0;
        int cnt = 0;
        
        while(cnt < jobs.length) {
            while(idx < jobs.length && jobs[idx][0] <= sec) {
                q.add(jobs[idx++]);
            }
                
                if(q.isEmpty()) {
                    sec = jobs[idx][0];
                } else {
                    int[] temp = q.poll();
                    sum += temp[1] + (sec - temp[0]);
                    sec += temp[1];
                    cnt++;
                }
            }
     
        return sum/jobs.length;
        
    }
}
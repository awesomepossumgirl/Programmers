import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long minTime = Long.MAX_VALUE; // 최소 시간 구할 변수
        Arrays.sort(times); // times 배열 오름차순 정렬
        
        long start = times[0];
        long mid = 0;
        long end = (long)times[times.length-1] * (long)n;
        long people = 0;
        
        while(start <= end) {
            mid = (start + end)/2;
            people = 0;
            
            for(int time : times) {
                people += mid / time;
            }
            if (people >= n) {
                minTime = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return minTime;
    }
}
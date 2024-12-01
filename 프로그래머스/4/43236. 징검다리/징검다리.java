import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        
        Arrays.sort(rocks);
        
        int[] interval = new int[rocks.length+1];
        interval[0] = rocks[0];
        interval[rocks.length] = distance - rocks[rocks.length-1];
        for(int i = 1; i < rocks.length; i++) {
            interval[i] = rocks[i] - rocks[i - 1];
        }
        
        int left = 1;
        int right = distance;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            int removedRocks = 0;
            int sumd = 0;
            
            for(int i = 0; i < interval.length; i++) {
                sumd += interval[i];
                
                if(sumd < mid) {
                    removedRocks++;
                } else {
                    sumd = 0;
                }
            }
            if (removedRocks > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
                answer = mid;
            }
        }
        return answer;
    }
}
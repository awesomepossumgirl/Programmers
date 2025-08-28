import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            countMap.put(tangerine[i], countMap.getOrDefault(tangerine[i], 0) + 1);
        }
        
        List<Integer> counts = new ArrayList<>(countMap.values());
        counts.sort(Collections.reverseOrder());
        
        int picked = 0;
        int kinds = 0;
        for (int c : counts) {
            picked += c;
            kinds++;
            if (picked >= k) break;
        }
        
        return kinds;
        
        
    }
}
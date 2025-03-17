import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            rankMap.put(sorted[i], sorted.length - i);
        }
        
        int[] result = new int[emergency.length];
        for (int i = 0; i <emergency.length; i++) {
            result[i] = rankMap.get(emergency[i]);
        }
        return result;
    }
}
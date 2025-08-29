import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> sums = new HashSet<>();
        
        // 길이 1부터 n까지 연속 부분 수열
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int i = 0; i < len; i++) {
                    sum += elements[(start + i) % n]; 
                }
                sums.add(sum);
            }
        }
        
        return sums.size();
    }
}
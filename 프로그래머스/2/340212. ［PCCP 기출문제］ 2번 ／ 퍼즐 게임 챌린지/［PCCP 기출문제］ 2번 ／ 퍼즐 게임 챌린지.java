// diff > level일 때
// time = (diff - level) * (time_cur + time_prev) + time_cur 
// diff ≤ level일 때
// time = time_cur

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        // 이분탐색
        int left = 1; 
        int right = 100000; // diff[i] 최댓값
        int answer = right;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canSolve(diffs, times, limit, mid)) {
                answer = mid;
                right = mid - 1; // 더 낮은 level 탐색
            } else {
                left = mid + 1; // 더 높은 level 필요
            }
            
        }
        
        return answer;
    }
    
    // 판별 메서드
    private boolean canSolve(int[] diffs, int[] times, long limit, int level) {
        long total = 0;
        
        // 0번 퍼즐
        if (diffs[0] > level) {
            total += (long)(diffs[0] - level) * times[0] + times[0];
        } else {
            total += times[0];
        }
        if (total > limit) return false;
        
        // 나머지 퍼즐
        for (int i = 1; i < diffs.length; i++) {
            if (diffs[i] > level) {
                total += (long)(diffs[i] - level) * (times[i] + times[i - 1])+ times[i];
            } else {
                total += times[i];
            }
            if (total > limit) return false;
        }
        
        return true;
    }
}
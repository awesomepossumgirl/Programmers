import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        // 각 명함의 가로와 세로 중 더 큰 값을 w로, 작은 값을 h로 설정
        for(int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            // 가로 최대값 갱신
            maxW = Math.max(maxW, w);
            // 가로 최소값 갱신
            maxH = Math.max(maxH, h);
        }
        return maxW * maxH;
    }
}
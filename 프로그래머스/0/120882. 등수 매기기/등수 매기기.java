import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        double[] avg = new double[n];
        for (int i = 0; i < n; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1; // 현재 사람보다 높은 점수 몇 개 인지 세기
            for (int j = 0; j < n; j++) {
                if (avg[j] > avg[i]) cnt++;
            }
            rank[i] = cnt;
        }
        return rank;
    }
}
import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[][] bd = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    int ip = Math.min(i + 1, n - 1);
                    int im = Math.max(i - 1, 0);
                    int jp = Math.min(j + 1, n - 1);
                    int jm = Math.max(j - 1, 0);
                    bd[i][j] = 1;
                    bd[i][jp] = 1;
                    bd[i][jm] = 1;
                    bd[ip][j] = 1;
                    bd[im][j] = 1;
                    bd[ip][jp] = 1;
                    bd[ip][jm] = 1;
                    bd[im][jp] = 1;
                    bd[im][jm] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (bd[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}
class Solution {
    public int[][] solution(int n) {
        // [0][0], [1][1], [2][2] 패턴만 0
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                }
            }
        } 
        return answer;
    }
}

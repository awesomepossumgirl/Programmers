import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int size = Math.max(rows, cols); // 정사각형 크기
        
        int[][] answer = new int[size][size];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        // 어차피 나머지 공간은 0으로 자동으로 초기화 된다
        return answer;
    }
}
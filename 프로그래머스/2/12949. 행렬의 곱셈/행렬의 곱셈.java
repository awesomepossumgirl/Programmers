import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row1 = arr1.length; // arr1의 행
        int col1 = arr1[0].length; // arr1의 열 = arr2의 행
        int col2 = arr2[0].length; // arr2의 열
        
        int[][] answer = new int[row1][col2]; // 결과 행렬 크기 
        
        for (int i = 0; i < row1; i++) { // 결과 행
            for (int j = 0; j < col2; j++) { // 결과 열
                for (int k = 0; k < col1; k++) { // 곱할 대상 (내부 덧셈 루프)
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
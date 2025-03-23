import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int row = num_list.length / n; // 이차원 배열의 행 개수
        int[][] answer = new int[row][n];
        
        for(int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i]; // n개씩 나눠서 채우기
        }
        return answer;
    }
}
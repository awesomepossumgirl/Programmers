import java.util.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length; 
        String color = board[h][w];
        
        
        // 상
        if (h-1 >= 0 && board[h-1][w].equals(color)) {
            answer++;
        } 
        // 하
        if (h+1 < n && board[h+1][w].equals(color)) {
            answer++;
        } 
        // 좌
        if (w-1 >= 0 && board[h][w-1].equals(color)) {
            answer++;
        }
        // 우
        if (w+1 < n && board[h][w+1].equals(color)) {
            answer++;
        }
        
        return answer;
    }
}
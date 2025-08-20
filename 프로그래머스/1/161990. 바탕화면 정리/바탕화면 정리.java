import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int row = wallpaper.length;
        int col = wallpaper[0].length();
        
        boolean[][] desktop = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    desktop[i][j] = true;
                }
            }
        }
        
        int[] start = {row, col};
        int[] end = {0, 0};
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (desktop[i][j]) {
                    start[0] = Math.min(i, start[0]);
                    start[1] = Math.min(j, start[1]);
                    end[0] = Math.max(i, end[0]);
                    end[1] = Math.max(j, end[1]);
                }
            }
        }
        
        return new int[]{start[0], start[1], end[0], end[1]};

    }
}
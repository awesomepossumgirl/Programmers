class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // 현재 위치 초기화
        int x = 0;
        int y = 0;
        // 이동 제한 범위 계산 (가로, 세로 각 최대 이동 거리)
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (y+1 <= maxY) y++;
                    break;
                case "down":
                    if (y-1 >= -maxY) y--;
                    break;
                case "left":
                    if (x-1 >= -maxX) x--;
                    break;
                case "right":
                    if (x+1 <= maxX) x++;
            }
        } 
        return new int[]{x,y};
    }
}
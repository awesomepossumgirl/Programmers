import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        // 1. 큰 돗자리부터 확인하기
        Arrays.sort(mats);
        int n = mats.length;
        
        int rows = park.length;
        int cols = park[0].length;
        
        for (int idx = n - 1; idx >= 0; idx--) { // 큰 것부터 확인
            int k = mats[idx];
            
            // 2. 시작점
            for (int i = 0; i <= rows - k; i ++) {
                for (int j = 0; j <= cols - k; j++) {
                    boolean canPlace = true;
                    
                    // 3. k * k 확인하기
                    for (int x = i; x < i + k; x++) {
                        for (int y = j; y < j + k; y++) {
                            if (!park[x][y].equals("-1")) {
                                canPlace = false;
                                break;
                            }
                        }
                        if (!canPlace) break; // false 나오면 다음 반복으로
                    }
                    
                    // 4. 돗자리 놓을 수 있으면 return
                    if (canPlace) {
                        return k;
                    }
                }
            }            
        }
    
        return -1;    
    }
}
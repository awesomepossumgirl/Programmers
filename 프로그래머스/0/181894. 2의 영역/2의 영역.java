import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int startIndex = -1;
        int endIndex = -1;
        
        // 처음, 마지막 2 위치 찾기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (startIndex == -1) {
                    startIndex = i;
                }
                endIndex = i;
            }
        }
        
        // 2없는 경우
        if (startIndex == -1) {
            return new int[]{-1};
        }
        
        // startIndex부터 endIndex까지 배열 복사
         return Arrays.copyOfRange(arr, startIndex, endIndex + 1);
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        //1. int[]를 Integer[]로 변환 Comparator 쓰기 위해
        Integer[] nums = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        // 2. 커스텀 정렬: n과의 거리 기준
         Arrays.sort(nums, (a, b) -> {
             int diffA = Math.abs(a - n);
             int diffB = Math.abs(b - n);
             
             if (diffA == diffB) {
                 return b - a; // 거리 같으면 큰 수 먼저
             }
             // 거리 차이 작을수록 먼저 
             return diffA - diffB; // 거리 기준 오름차순 정렬
        });
        // 3. Integer[]을 다시 int[]로 
        return Arrays.stream(nums).mapToInt(i -> i).toArray();
    }
}
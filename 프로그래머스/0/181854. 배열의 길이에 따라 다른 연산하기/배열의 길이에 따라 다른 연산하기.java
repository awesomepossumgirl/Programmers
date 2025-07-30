import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        int start = (arr.length % 2 == 1) ? 0 : 1;
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == start) {
                list.add(arr[i] + n);
            } else {
                list.add(arr[i]);
            }
        }
            
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
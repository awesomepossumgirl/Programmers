import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int cnt = arr[i];
            for (int j = 1; j <=cnt; j++ )
                list.add(arr[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
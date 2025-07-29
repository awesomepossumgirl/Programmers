import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) { // 조건문에서 바로 boolean 값 사용
                // arr[i] * 2번 추가
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                // 리스트 끝에서 arr[i]개 원소 제거
                for (int j = 0; j < arr[i]; j++) {
                   list.remove(list.size() - 1);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        // int[]를 list로 바꾸기
        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
            list.add(n);
        }
        
        // list에서 delete_list에 있는 요소만 삭제하기
        for (int del : delete_list) {
            // int → Integer로 명시해야 인덱스가 아닌 값이 제거됨
            list.remove(Integer.valueOf(del));
        }
        
        // list를 int[]로 바꾸기
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
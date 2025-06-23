import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int index = num_list.length - 1;
        int[] answer = new int[index + 2];
        for (int i = 0 ; i <= index; i++) {
            answer[i] = num_list[i];
        }
        if (num_list[index] - num_list[index - 1] > 0) {
            answer[index + 1] = num_list[index] - num_list[index - 1];
        } else {
            answer[index + 1] = num_list[index] * 2;
        }
        return answer;
    }
}
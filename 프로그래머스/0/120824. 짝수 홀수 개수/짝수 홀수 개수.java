import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even_cnt = 0;
        int odd_cnt = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i]%2==0) {
                even_cnt++;
            } else {
                odd_cnt++;
            }
        }
        answer[0] = even_cnt;
        answer[1] = odd_cnt;
        return answer;
    }
}
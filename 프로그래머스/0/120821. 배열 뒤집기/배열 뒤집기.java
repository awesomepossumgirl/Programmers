import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = Arrays.copyOf(num_list, n); // 원본 배열 복사
        for (int i = 0; i < n/2; i++) {
            int tmp = answer[i]; // 현재 값 임시 변수에 저장
            answer[i] = answer[n - 1 - i]; // 반대 값으로 교체
            answer[n - 1 - i] = tmp; // 저장해 놓은 임시 값으로 교체 
        }
        return answer;
    }
}
/*
import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for (int num : num_list) {
            list.add(num);
        }
        Collections.reverse(list);  // 리스트 뒤집기

        return list.stream().mapToInt(i -> i).toArray();  // 배열로 변환하여 반환
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - 1 - i];  // 역순 복사
        }

        return answer;
    }
}
*/
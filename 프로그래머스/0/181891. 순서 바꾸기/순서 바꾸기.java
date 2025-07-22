class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        
        // n번째 이후 요소 먼저
        for (int i = n; i < num_list.length; i++) {
            answer[idx++] = num_list[i];
        }
        
        // n번째까지 요소가 뒤에 오도록
        for (int i = 0; i < n; i++) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}
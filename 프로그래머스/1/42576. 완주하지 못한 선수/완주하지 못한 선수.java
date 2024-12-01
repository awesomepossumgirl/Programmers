import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 1. 배열 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        // 2. for문 돌려서 배열 비교
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        // 3. 마지막 주자가 완주하지 못한 경우
        return participant[i];
    }
    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Solution sol = new Solution();
        System.out.println(sol.solution(part, comp));
    }
}
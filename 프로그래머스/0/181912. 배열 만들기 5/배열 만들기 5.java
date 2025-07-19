import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (String str : intStrs) {
            // s번 인덱스부터 길이 l만큼 부분 문자열 자르기
            String sub = str.substring(s, s + l);
            int val = Integer.parseInt(sub);
            
            if (val > k) {
                answer.add(val);
            }
        }
        
        // List<Integer>을 int[]로 변환하기
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}
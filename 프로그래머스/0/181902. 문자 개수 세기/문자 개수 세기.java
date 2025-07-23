class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        /*
        for (int i = 0; i < my_string.length(); i++) {
        }
        */
        for (char ch : my_string.toCharArray()) {
             if (ch >= 'A' && ch <= 'Z') {
                answer[ch - 'A']++; // 대문자 인덱스
            } else if (ch >= 'a' && ch <= 'z') {
                answer[ch - 'a' + 26]++; // 소문자 인덱스
            }
        }
        return answer;
    }
}
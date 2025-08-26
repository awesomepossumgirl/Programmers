class Solution {
    public String solution(String s, int n) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".repeat(2);
        String lower = "abcdefghijklmnopqrstuvwxyz".repeat(2);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                int idx = c - 'a';          // 소문자 기준 인덱스
                sb.append(lower.charAt(idx + n)); // n만큼 이동
            } else if (c >= 'A' && c <= 'Z') {
                int idx = c - 'A';          // 대문자 기준 인덱스
                sb.append(upper.charAt(idx + n)); // n만큼 이동
            } else {
                sb.append(c); // 공백이나 특수문자는 그대로
            }
        }

        return sb.toString();
    }
}

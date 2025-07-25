class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);

            if (ch == 'a') {
                sb.append('A');
            } else if (ch == 'A') {
                sb.append('A'); // 대문자 A는 그대로 유지
            } else if (ch >= 'B' && ch <= 'Z') {
                // A 제외 모든 대문자 소문자로 변환
                sb.append(Character.toLowerCase(ch));
            } else {
                // 소문자, 공백 등 기타 문자 그대로 유지
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}

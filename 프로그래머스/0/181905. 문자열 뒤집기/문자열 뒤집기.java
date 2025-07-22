class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        // s 이전 문자들 추가
        sb.append(my_string.substring(0, s));
        // s-e까지 문자열 뒤집기
        StringBuilder mid = new StringBuilder(my_string.substring(s, e+1));
        mid.reverse();
        sb.append(mid);
        // e 이후 뒷부분 그대로 추가
        sb.append(my_string.substring(e + 1));
        return sb.toString();
    }
}
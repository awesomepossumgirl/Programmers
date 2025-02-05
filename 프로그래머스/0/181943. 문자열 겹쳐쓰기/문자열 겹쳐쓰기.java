class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 앞부분과 뒷부분을 추출한 후 overwrite_string을 중간에 삽입
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }
}
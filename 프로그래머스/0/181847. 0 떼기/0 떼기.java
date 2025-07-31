/*
class Solution {
    public String solution(String n_str) {
        int idx = 0;
        while (idx < str.length() && str.charAt(idx) == ch) {
            idx++;
        }
        return str.substring(idx);
    }
}
*/
class Solution {
    public String solution(String n_str) {
        // 시작부터 연속된 0제거하는 정규식
        return n_str.replaceFirst("^0+", ""); 
    }
}


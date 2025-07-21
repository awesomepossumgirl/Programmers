class Solution {
    public String solution(String my_string, int n) {
        int s = my_string.length() - n;
        String answer = my_string.substring(s);
        return answer;
    }
}
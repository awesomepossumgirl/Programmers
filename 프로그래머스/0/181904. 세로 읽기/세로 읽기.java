class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int rows = my_string.length() / m;
        for (int i = 0; i < rows; i++) {
            int index = i * m + (c - 1); // c는 1부터 시작, 인덱스는 0부터
            sb.append(my_string.charAt(index));
        }
        return sb.toString();
    }
}
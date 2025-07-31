class Solution {
    public int solution(String num_str) {
        int sum = 0;
        for (char ch : num_str.toCharArray()) {
            // sum += Integer.parseInt(c); 틀린코드
            sum += ch - '0';
        }
        return sum;
    }
}
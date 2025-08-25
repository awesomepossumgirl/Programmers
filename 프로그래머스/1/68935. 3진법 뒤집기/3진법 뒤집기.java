class Solution {
    public int solution(int n) {
        // 1, 10진수를 3진수 문자열로 변환
        String three = Integer.toString(n, 3);
        // 2. 3진수 문자열을 뒤집기
        String reversed = new StringBuilder(three).reverse().toString();
        // 3. 뒤집힌 문자열을 10진수로 변환하기
        int answer = Integer.parseInt(reversed, 3);
        
        return answer;
    }
}
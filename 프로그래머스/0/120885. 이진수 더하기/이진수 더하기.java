class Solution {
    public String solution(String bin1, String bin2) {
        // 이진수 문자열 → 10진수 숫자로 변환
        int n1 = Integer.parseInt(bin1, 2);
        int n2 = Integer.parseInt(bin2, 2);
        
        // 두 수를 더하고, 다시 이진수를 문자열로 변환
        return Integer.toBinaryString(n1 + n2);
    }
}
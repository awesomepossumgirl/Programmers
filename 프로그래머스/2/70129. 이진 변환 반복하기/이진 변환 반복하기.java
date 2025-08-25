class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;
        
        while (!s.equals("1")) {
            count++;
            
            // 0 제거
            int beforeLength = s.length();
            s = s.replace("0", "");
            int afterLength = s.length();
            zeroCount += beforeLength - afterLength;
            
            // 이진수 문자열로
            int len = s.length();
            s = Integer.toBinaryString(len);
        }
        
        return new int[]{count, zeroCount};
    }
}
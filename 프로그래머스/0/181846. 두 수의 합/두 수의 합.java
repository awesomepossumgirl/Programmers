import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        try {
            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);
            
            BigInteger sum = bigA.add(bigB);
            
            return sum.toString();
        } catch (NumberFormatException e) {
            // 숫자 아닌 입력 들어온 경우 예외처리
            return "올바른 숫자가 아닙니다.";
        }
    }
}
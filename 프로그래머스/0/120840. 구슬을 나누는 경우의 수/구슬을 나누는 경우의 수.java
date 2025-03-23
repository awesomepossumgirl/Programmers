class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        for (int i = 1; i <= share; i++) {
            answer *= (balls - (share - i));
            answer /= i;
        }
        return answer;
    }
}
/*
import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = BigInteger.ONE;
        for (int i = 1; i <= share; i++) {
            answer = answer.multiply(BigInteger.valueOf(balls - (share - i)));
            answer = answer.divide(BigInteger.valueOf(i));
        }
        return answer;
    }
}
*/
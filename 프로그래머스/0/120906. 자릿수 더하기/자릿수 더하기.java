class Solution {
    public int solution(int n) {
        int sum = 0;
        String str = String.valueOf(n); // 정수를 문자열로
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0'; // 각 문자를 숫자로 변환 후 더하기
        }
        return sum;
    }
}

/*
class Solution {
    public int solution(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;  // 마지막 자리 숫자를 더함
            n /= 10;        // 마지막 자리 숫자를 제거
        }

        return sum;
    }
}
*/
class Solution {
    public int solution(int n) {
        return lcm(n, 6) / 6;
    }

    // 최소공배수(LCM) 구하기: LCM(a, b) = (a * b) / GCD(a, b)
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 최대공약수(GCD) 구하기 (유클리드 호제법)
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

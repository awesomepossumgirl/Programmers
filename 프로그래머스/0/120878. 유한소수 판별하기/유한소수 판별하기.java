class Solution {
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public int solution(int a, int b) {
        int g = gcd(a, b);
        int num = b/g; // 여기서 굳이 (int) b/g 할 필요 없어서 수정함
        
        // 2와 5이외의 소인수가 남아 있는지 체크
        while (num%2 == 0) num /= 2;
        while (num%5 == 0) num /= 5;
        return num == 1? 1 : 2;
    }
}
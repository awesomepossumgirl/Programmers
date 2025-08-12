/*
class Solution {
    // 최대공약수
    public int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
    
    // 최소 공배수
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }
}
*/

class Solution {
    public int[] solution(int n, int m) {
        int gcd = 1;
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        
        // 유클리드 호제법(반복문)
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        gcd = a;
        
        int lcm = (n * m) / gcd;
        
        return new int[]{gcd, lcm};
        
    }
}

class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + b;
        String ba = String.valueOf(b) + a;
        return Integer.parseInt(ab.compareTo(ba) > 0 ? ab : ba);
    }
}
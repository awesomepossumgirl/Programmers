class Solution {
    public int solution(int a, int b) {
        String abStr = String.valueOf(a) + b;
        int abInt = Integer.parseInt(abStr);
        return abInt > 2*a*b ? abInt : 2*a*b;
    }
}
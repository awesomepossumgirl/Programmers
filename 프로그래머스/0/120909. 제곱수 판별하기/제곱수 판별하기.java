class Solution {
    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n); //n의 제곱근 구하고 정수로 변환
        if(sqrt*sqrt == n) return 1; 
        else return 2;
    }
}
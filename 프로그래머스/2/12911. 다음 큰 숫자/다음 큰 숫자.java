class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n); // n의 1 개수
        int next = n + 1; 
        
        while (Integer.bitCount(next) != count) {
            next++;
        }
        
        return next;
    }
}

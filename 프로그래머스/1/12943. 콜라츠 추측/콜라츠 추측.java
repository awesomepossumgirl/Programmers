class Solution {
    public int solution(int num) {
        long n = num; 
        int cnt = 0;
        while(n != 1 && cnt < 500) {
            if (n % 2 == 0) {
                n = n/2;
            } else {
                n = n *3 + 1;
            }
            cnt++;
        }
        
        return (n == 1) ? cnt : -1;
    }
}
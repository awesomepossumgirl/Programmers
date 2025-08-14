import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        // 지폐가 들어갈 때까지 반복
        while (bill[0] > wallet[0] || bill[1] > wallet[1]) {
            // 긴 쪽 반으로 접기
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer++;
            Arrays.sort(bill);
        }
            
        return answer;
    }
}
/* class Solution {
    public int solution(int[] num_list) {
        int count = 0;

        for (int num : num_list) {
            while (num > 1) {
                num /= 2;
                count++;
            }
        }

        return count;
    }
}
*/

class Solution {
    public int solution(int[] num_list) {
        int cnt = 0;
        
        while (true) {
            boolean allOne = true;
            
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] > 1) {
                    allOne = false; // 아직 배열에 1이 아닌 원소가 있음
                    if (num_list[i] % 2 == 0) {
                        num_list[i] /= 2;
                    } else {
                        num_list[i] = (num_list[i] - 1) / 2;
                    }
                    cnt++; 
                }
            }
            if (allOne) break;
        } 
        return cnt;
    }
}
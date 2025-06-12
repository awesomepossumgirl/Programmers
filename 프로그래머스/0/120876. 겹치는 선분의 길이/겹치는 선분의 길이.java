class Solution {
    public int solution(int[][] lines) {
        int[] line = new int[201];
        
        for(int[] l : lines) {
            int start = l[0] + 100;
            int end = l[1] + 100;
            for (int i = start; i < end; i++) {
                line[i]++;
            }
        }
        int answer = 0;
        for (int cnt : line) {
            if (cnt >= 2) answer++;
        }
        return answer;
    }
}
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // boolean 배열 선언하고 section에 든 인덱스만 true로 바꾸기 
        boolean[] painted = new boolean[n];
        for (int i = 0 ; i < section.length; i++) {
            painted[section[i] - 1] = true;
        }
        
        for (int i = 0; i < n; i++) {
            if (painted[i]) {
                // i부터 m칸을 칠했다고 가정 → false로 갱신
                for (int j = i; j < i + m && j < n; j++) {
                    painted[j] = false;
                }
                answer++;
            }
        }
        
        return answer;
    }
}
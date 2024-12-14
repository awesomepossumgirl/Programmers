class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int sum = 0;
        int start = 0;
        int end = 0;
        int len = -1;
        
        // start는 위에서 초기화 함
        // 누적합이 k보다 작은 구간 찾기
        for (; start < sequence.length; start++)  {
            while (end < sequence.length && sum < k) {
                sum += sequence[end++];
            }
            // 특정 조건을 만족하는 구간 (부분배열) 찾기 
            // 그중에서도 가장 짧은 길이를 가진 구간을 저장
            if (sum == k) {
                if(len == -1 || len > end - start) {
                    answer[0] = start;
                    answer[1] = end-1;
                    len = end - start;
                }
            }
            sum -= sequence[start];
        }
        return answer;
    }
}
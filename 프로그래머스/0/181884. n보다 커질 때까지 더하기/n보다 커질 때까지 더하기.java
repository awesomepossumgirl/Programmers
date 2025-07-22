class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
            if (sum > n) {
                return sum;
            }
        }
        return sum; // 혹시나 모든 수를 더해도 n을 넘지 않는 경우
    }
}
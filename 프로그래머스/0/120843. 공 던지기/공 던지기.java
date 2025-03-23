class Solution {
    public int solution(int[] numbers, int k) {
        // 2칸씩 K-1번 이동 후 배열 크기로 나눈 나머지
        int index = (2*(k-1)) % numbers.length;
         // 최종적으로 공을 받는 사람의 번호 반환
        return numbers[index];
    }
}
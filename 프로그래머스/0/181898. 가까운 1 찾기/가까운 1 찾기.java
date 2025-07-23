class Solution {
    public int solution(int[] arr, int idx) {
        for(int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i; // 가장 먼저 나오는 1의 인덱스 반환
            }
        }
        return -1; // 끝까지 1이 없으면 -1 반환
    }
}
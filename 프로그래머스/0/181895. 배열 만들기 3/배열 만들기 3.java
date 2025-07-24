import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] part1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] part2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        
        // 두 배열을 합치기
        int[] answer = new int[part1.length + part2.length];
        System.arraycopy(part1, 0, answer, 0, part1.length);
        System.arraycopy(part2, 0, answer, part1.length, part2.length);
        
        return answer;
    }
}

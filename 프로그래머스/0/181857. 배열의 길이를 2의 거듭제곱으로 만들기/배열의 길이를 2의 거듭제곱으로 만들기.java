import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        
        // 리스트 크기가 2의 거듭제곱이 될 때까지 0 추가
        while (!isPowerOfTwo(list.size())) {
            list.add(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    // 2의 거듭제곱인지 확인하는 메서드
    private boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
}
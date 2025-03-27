import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> primeFacs = new LinkedHashSet<>();
        
        // 2부터 n까지 나누어 떨어지는 수 찾기
        for (int i= 2; i * i <= n; i++ ) {
            while (n % i == 0) {
                primeFacs.add(i);
                n /= i;
            }
        }
        
        // n이 마지막으로 남은 소수면 추가하기
        if (n > 1) primeFacs.add(n);
        
        // Set → 배열로 변환
        return primeFacs.stream().mapToInt(Integer::intValue).toArray();
        
    }
}
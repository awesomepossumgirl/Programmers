import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Map<Integer, Integer> count = new HashMap<>();
        
        // 빈도 계산
        for (int num : dice) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int size = count.size();
        List<Integer> keys = new ArrayList<>(count.keySet());

        if (size == 1) {
            // case 1: 네 개 모두 같은 수
            int p = keys.get(0);
            return 1111 * p;

        } else if (size == 2) {
            Collection<Integer> freqs = count.values();
            if (freqs.contains(3)) {
                // case 2: (p, p, p, q)
                int p = 0, q = 0;
                for (int key : keys) {
                    if (count.get(key) == 3) p = key;
                    else q = key;
                }
                return (int) Math.pow(10 * p + q, 2);
            } else {
                // case 3: (p, p, q, q)
                int p = keys.get(0);
                int q = keys.get(1);
                return (p + q) * Math.abs(p - q);
            }

        } else if (size == 3) {
            // case 4: (p, p, q, r)
            int result = 1;
            for (int key : keys) {
                if (count.get(key) == 1) result *= key;
            }
            return result;

        } else {
            // case 5: 다 다를때
            return Arrays.stream(dice).min().getAsInt();
        }
    }
}

import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {  
            String s = Integer.toString(i);
            boolean valid = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c != '0' && c != '5') {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return new int[] {-1};
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        int cnt = 0;
        for (String str : s2) {
            if (set.contains(str)) cnt++;
        }
        return cnt; 
    }
}

/*
class Solution {
    public int solution(String[] s1, String[] s2) {
        int cnt = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}
*/
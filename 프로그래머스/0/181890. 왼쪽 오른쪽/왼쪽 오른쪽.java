import java.util.*;

class Solution {
    public List<String> solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                // "l" 기준 왼쪽 부분 추출 (0 ~ i-1)
                return Arrays.asList(Arrays.copyOfRange(str_list, 0, i));
            } else if (str_list[i].equals("r")) {
                // "r" 기준 오른쪽 부분 추출 (i+1 ~ 끝)
                return Arrays.asList(Arrays.copyOfRange(str_list, i + 1, str_list.length));
            }
        }
        // "l"이나 "r"이 없다면
        return new ArrayList<>();
    }
}
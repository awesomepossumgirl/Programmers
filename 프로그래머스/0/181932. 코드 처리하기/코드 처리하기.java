class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        
        for (int idx = 0; idx < code.length(); idx++) {
            char ch = code.charAt(idx);
            
            if (ch == '1') {
                mode = 1 - mode; // mode 전환
            } else {
                if ((mode == 0 && idx % 2 == 0) || (mode == 1 && idx % 2 == 1)) {
                    ret.append(ch);
                }
            }
        }
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}
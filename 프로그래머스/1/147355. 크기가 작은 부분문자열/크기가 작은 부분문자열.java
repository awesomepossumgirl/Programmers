class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        int count = 0;
        long pNum = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - len; i++) {
            long subNum = Long.parseLong(t.substring(i, i + len));

            if (subNum <= pNum) {
                count++;
            };
        }
        
        return count;
    }
}
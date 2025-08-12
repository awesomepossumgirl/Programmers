class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        String str = s.toLowerCase();
        
        for (char c : str.toCharArray()) {
            if (c == 'p') {
                pCnt++;
            } else if (c == 'y') {
                yCnt++;
            }
        }
        
        return pCnt == yCnt;
    }
}
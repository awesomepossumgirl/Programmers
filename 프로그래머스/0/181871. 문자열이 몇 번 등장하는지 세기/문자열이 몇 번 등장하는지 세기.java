class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        int idx = 0;
        while ((idx = myString.indexOf(pat, idx)) != -1) {
            cnt++;
            idx += 1; // 다음 위치부터 탐색
            // 겹치는 것도 찾으려면 index++ 이 아니라
            // index += pat.length() 대신 index++
        }
        
        return cnt;
    }
}
class Solution {
    public String solution(String myString, String pat) {
        // 먼저 pat을 찾고
        // 그 앞 처음부터 pat까지 substring() 하면 되겠네
        
        int idx = myString.lastIndexOf(pat);
        int len = pat.length();
        return myString.substring(0, idx+len);
    }
}
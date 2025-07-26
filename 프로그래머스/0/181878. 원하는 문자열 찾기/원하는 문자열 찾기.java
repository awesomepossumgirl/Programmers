/*
class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();  // 모두 소문자로
        pat = pat.toLowerCase();            // 모두 소문자로
        
        return myString.contains(pat) ? 1 : 0;
    }
}
*/
class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();  // 모두 소문자로
        pat = pat.toLowerCase();            // 모두 소문자로
        int len = pat.length();
        for(int i = 0; i <= myString.length() - len; i++) {
            String str = myString.substring(i,i + len);
            if (str.equals(pat)) return 1;
        }
        return 0;
    }
}
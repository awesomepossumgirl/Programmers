class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (char c : arr) {
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
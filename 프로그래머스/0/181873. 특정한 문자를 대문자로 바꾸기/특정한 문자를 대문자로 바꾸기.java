/*
public String solution(String my_string, String alp) {
    return my_string.replace(alp, alp.toUpperCase());
}
*/
class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        char target = alp.charAt(0); // String → char
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c == target) {
                sb.append(String.valueOf(c).toUpperCase()); // char → String
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
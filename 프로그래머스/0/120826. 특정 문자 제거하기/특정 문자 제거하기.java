class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()) {
            if(c!=letter.charAt(0)) sb.append(c);
        }
        return sb.toString();
    }
}
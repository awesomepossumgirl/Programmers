class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] str = s.split(" ", 0);
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("")) {
                sb.append(" ");
                continue;
            }
            char first = str[i].charAt(0);
            if (Character.isDigit(first)) {
                sb.append(first);
            } else {
                sb.append(Character.toUpperCase(first));
            }
            
            if (str[i].length() > 1) {
                sb.append(str[i].substring(1).toLowerCase());
            }
            
            if (i < str.length - 1) {
                sb.append(" ");
            }
        }
        
        // 원본 문자열 끝 공백 유지
        int originalLength = s.length();
        while (sb.length() < originalLength) {
            sb.append(" ");
        }
        
        return sb.toString();
    }
}
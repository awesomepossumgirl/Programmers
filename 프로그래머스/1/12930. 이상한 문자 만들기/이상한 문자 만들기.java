class Solution {
    public String solution(String s) {
        // 먼저 얘를 공백 기준으로 분리해서 배열에 넣고
        String[] str = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (j % 2 == 0) {
                    sb.append(Character.toUpperCase(str[i].charAt(j)));
                } else {
                    sb.append(Character.toLowerCase(str[i].charAt(j)));
                }
            }
            sb.append(" ");
        }
        
        // 마지막 공백 제거
        sb.deleteCharAt(sb.length() - 1);
        
        return sb.toString();
    }
}
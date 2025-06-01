class Solution {
    public int solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(Character.isDigit(c)) {
                sb.append(c);
            } else { // 공백이나 문자 왔을 때 sb에 있는 숫자를 answer에 더하기
                if(sb.length()>0) {
                    answer += Integer.parseInt(sb.toString());
                    sb.setLength(0); // sb 내부 문자열 초기화
                }
            }     
        }
        // 마지막 글자가 숫자일 때 처리
        if (sb.length()>0) {
            answer += Integer.parseInt(sb.toString());
        }       
        return answer;
    }
}
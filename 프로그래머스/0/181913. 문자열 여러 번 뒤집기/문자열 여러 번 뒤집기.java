class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int[] query : queries) {
            int s = query[0]; // 뒤집기 할 시작 인덱스
            int e = query[1]; // 뒤집기 할 끝 인덱스
            
            // 양쪽 끝에서 가운데로 이동하며 문자 교환 (reverse)
            while (s < e) {
                // 문자 교환 (swap)
                char temp = sb.charAt(s);
                sb.setCharAt(s, sb.charAt(e));
                sb.setCharAt(e, temp);
                // 다음 위치로 이동
                s++;
                e--;
            }
        }
        return sb.toString();
    }
}
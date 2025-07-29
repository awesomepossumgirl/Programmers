class Solution {
    public int solution(String myString, String pat) {
        
        // A를 B로, B를 A로 바꾸기
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                sb.append('B');
            } else if (c == 'B') {
                sb.append('A');
            }
        }
        // 연속하는 부분 문자열 중 pat이 있는지
        return (sb.toString().contains(pat)) ? 1 : 0;
        
    }
}
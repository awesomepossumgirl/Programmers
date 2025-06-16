class Solution {
    public int solution(String A, String B) {
        for(int i = 0; i < A.length(); i++) {
            if (A.equals(B)) return i;
            // 오른쪽으로 밀기 + 마지막 글자는 앞으로
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
            }
        return -1; // B가 안되면 -1 리턴
        }
}
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">") && eq.equals("=")) {
            return n >= m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            return n > m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            return n <= m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("!")) {
            return n < m ? 1 : 0;
        }
        return 0; // 예외 처리용 (입력값이 이상한 경우)
    }
}
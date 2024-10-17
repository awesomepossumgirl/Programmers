class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail"; // 기본 값을 "fail"로 설정

        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                return "login"; // 로그인 성공
            } else if (id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
                answer = "wrong pw"; // 비밀번호 오류
            }
            // 사용자 존재하지 않는 경우는 "fail"로 기본 설정이 유지
        }

        return answer; // 최종 결과 반환
    }
}

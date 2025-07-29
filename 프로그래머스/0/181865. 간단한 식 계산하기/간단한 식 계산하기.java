class Solution {
    public int solution(String binomial) {
        // binomial 을 op와 숫자로 나눈다
        // op를 switch-case구문으로 분기해서 각 각 리턴
        // 계산기 생각하면 됨   
        
        // 정규식으로 숫자만 분리
        String[] splited = binomial.split("[+\\-*]");
        int num1 = Integer.parseInt(splited[0].trim());
        int num2 = Integer.parseInt(splited[1].trim());
        
        // 연산자 추출
        char op = ' ';
        for (char c : binomial.toCharArray()) {
            if (c == '+' || c == '-' || c == '*') {
                op = c;
                break;
            }
        }
        
        // op에 따라 계산 분기
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                throw new IllegalArgumentException("지원하지 않는 연산자: " + op);
        }
    }
}
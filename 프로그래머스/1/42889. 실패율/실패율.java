import java.util.*; 

class Solution {
    public int[] solution(int N, int[] stages) {
        int total =  stages.length;
        int[] answer = new int[N];
        
        //  실패율 저장할 배열: [스테이지 번호, 실패율]
        double[][] failRates = new double[N][2];
        
        for (int i = 1; i <=N; i++) {
            int stageNum = i; // 스테이지 번호
            int fail = 0; // 현재 스테이지에 도전했지만 실패한 사람 수
          
            // 실패한 사람 수 구하기
            for (int s : stages) {
                if (s == stageNum) fail++;
            }

            double rate = 0; // 실패율
            if (total != 0) { // ArithmeticException 방지 예외처리
                rate = (double) fail / total;
            }

            failRates[i - 1][0] = i; // 스테이지 번호
            failRates[i - 1][1] = rate; // 실패율
            
            total -= fail; // 다음 스테이지 도전자 수 줄이기
        }
        
        // 실패율 내림차순 정렬, 같으면 스테이지 번호 오름차순
        Arrays.sort(failRates, (a, b) -> {
            if (Double.compare(b[1], a[1]) == 0) {
                return Integer.compare((int) a[0], (int) b[0]);
            }
            return Double.compare(b[1], a[1]);
        });
        
        // 스테이지 번호만 추출하기
        for (int i = 0; i < N; i++) {
            answer[i] = (int) failRates[i][0];
        }
        
        return answer;
    }
}
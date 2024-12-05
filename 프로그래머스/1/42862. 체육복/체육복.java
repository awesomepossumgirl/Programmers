import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

		// 배열 정렬
		Arrays.sort(reserve);
		Arrays.sort(lost);

		// 체육복 도난당하지 않은 학생 수
		// 전체학생수 - 도난당한 학생 수
		answer = n - lost.length;

		// 여벌 체육복 가져왔으나 도난당한 학생 수
		// 체육시간에 참여할 수 있으나 다른 학생에게 빌려줄 수 없으므로
		// lost 배열과 reserve 배열에서 해당 학생의 번호를 삭제해 주어야 함.
		// 나는 상관 없는 값 -1로 설정해 줌
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}
		// 도난당했지만 체육복을 빌릴 수 있는 학생 수
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}

		return answer;
    }
}
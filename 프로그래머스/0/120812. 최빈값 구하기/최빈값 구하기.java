import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
		int maxCount = 0;
		int mode = -1;
		boolean isDuplicate = false;

		// 각 숫자의 등장 횟수 저장하기
		for (int num : array) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		/*
		if (frequencyMap.containsKey(num)) {
			frequencyMap.put(num, frequencyMap.get(num) + 1);
		} else {
			frequencyMap.put(num, 1);
		}
		*/

		// 최빈값 찾기
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			int key = entry.getKey();
			int count = entry.getValue();

			if (count > maxCount) {
				maxCount = count;
				mode = key;
				isDuplicate = false; // 새로운 최빈값 나오면 중복 해제
			} else if (count == maxCount) {
				isDuplicate = true; // 최빈값이 여러개인 경우
			}
		}
		return isDuplicate ? -1 : mode;
    }
}
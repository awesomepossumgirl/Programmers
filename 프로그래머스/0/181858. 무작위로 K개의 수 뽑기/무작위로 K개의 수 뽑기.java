import java.util.*; 

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> result = new ArrayList<>(); // 결과를 저장할 리스트
        Set<Integer> seen = new HashSet<>();      // 중복 체크를 위한 Set

        // arr 배열을 앞에서부터 하나씩 확인
        for (int num : arr) {
            // 아직 나온 적 없는 숫자라면
            if (!seen.contains(num)) {
                seen.add(num);         // 중복 체크용 Set에 추가
                result.add(num);       // 결과 리스트에도 추가

                // k개를 모두 모았으면 더 이상 반복할 필요 없음
                if (result.size() == k) break;
            }
        }

        // 만약 결과 리스트가 k개보다 작으면
        // 부족한 부분을 -1로 채움
        while (result.size() < k) {
            result.add(-1);
        }

        // List<Integer> → int[]
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
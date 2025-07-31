import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> candidates = new ArrayList<>();
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                candidates.add(i); // 참가 가능한 학생의 번호(index) 저장하기
            }
        }
        
        // 학생 번호 리스트를 rank 기준으로 정렬하기
        // rank 값 기준으로 오름차순 정렬
        // rank[i]가 작은 순서대로 → 1등. 2등, 3등...
        // 만약 내림차순으로 정렬하고 싶으면 Comparator에 .reversed()붙이기
        // candidates.sort(Comparator.comparingInt((Integer i) -> rank[i]).reversed());
        // 중요포인트는 reversed()를 쓰기 위해선 (Integer i) 처럼 람다 파라미터의 타입을 명시해야 한다
        // 타입 안 쓰면 컴파일 에러
        candidates.sort(Comparator.comparingInt(i -> rank[i]));
        
        int a = candidates.get(0); // 가장 높은 순위
        int b = candidates.get(1);
        int c = candidates.get(2);
        
        return 10000 * a + 100 * b + c;
    }
}
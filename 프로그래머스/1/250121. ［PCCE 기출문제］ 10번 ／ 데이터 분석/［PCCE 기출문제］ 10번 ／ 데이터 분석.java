import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 문자열, 인덱스 매핑
        Map<String, Integer> map = Map.of(
            "code", 0,
            "date", 1,
            "maximum", 2,
            "remain", 3
        );
        
        int idx = map.get(ext); // 필터 인덱스
        int sortIdx = map.get(sort_by); // 정렬 인덱스
        
        return Arrays.stream(data)
                .filter(arr -> arr[idx] < val_ext) // 조건 맞는 애들만 필터링
                .sorted(Comparator.comparingInt(a -> a[sortIdx])) // 정렬
                .toArray(int[][]::new); // 배열로 변환
    }
}
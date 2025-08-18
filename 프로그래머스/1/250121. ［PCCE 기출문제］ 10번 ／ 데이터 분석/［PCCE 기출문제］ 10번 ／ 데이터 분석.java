// 1. ext < val_ext 만 list에 추가 - 2차원 리스트?
// 2. sort_by 기준 정렬 - 람다
import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        int idx = 0; // 필터 인덱스
        int sortIdx = 0; // 정렬 인덱스
        switch (ext) { // 필터 기준
            case "code":
                idx = 0; break;
            case "date":
                idx = 1; break;
            case "maximum":
                idx = 2; break;
            case "remain":
                idx = 3; break;
        }
        switch (sort_by) { // 정렬 기준
            case "code":
                sortIdx = 0; break;
            case "date":
                sortIdx = 1; break;
            case "maximum":
                sortIdx = 2; break;
            case "remain":
                sortIdx = 3; break;
        }
        // 조건에 맞는 데이터만 추가
        for(int i = 0; i < data.length; i++) {
            if (data[i][idx] < val_ext) list.add(data[i]);
        }
        // 람다에서 사용하기 위해 final 변수 선언
        final int sortIndex = sortIdx;
        // 람다식 정렬
        list.sort((a, b) -> Integer.compare(a[sortIndex], b[sortIndex]));
        
        return list.toArray(new int[list.size()][]);
    }
}
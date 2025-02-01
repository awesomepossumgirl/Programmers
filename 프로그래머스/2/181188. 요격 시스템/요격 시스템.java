import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);
        
        int endpoint = 0;
        for (int i = 0; i < targets.length; i++) {
            if(endpoint <= targets[i][0]) {
                endpoint = targets[i][1];
                answer++;
            }
        }
        return answer;
    }
}

/*
class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        // 폭격 미사일 구간을 끝 점을 기준으로 정렬
        Arrays.sort(targets, (a, b) -> Integer.compare(a[1], b[1]));
        
        // 마지막으로 발사된 요격 미사일의 x 좌표
        double lastIntercept = -1.0;
        
        for (int[] target : targets) {
            // 만약 현재 폭격 미사일의 구간에 요격 미사일이 포함되지 않으면
            if (lastIntercept < target[0]) {
                // 새로운 요격 미사일을 발사
                lastIntercept = target[1] - 0.000000001; // 끝 점에서 바로 앞의 실수 위치에 발사
                answer++;
            }
        }
        
        return answer;
    }
}
*/
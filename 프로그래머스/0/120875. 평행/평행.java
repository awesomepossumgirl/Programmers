class Solution {
    // 기울기 계산 함수
    double slope(int[] p1, int[] p2) {
        return (double)(p2[1]-p1[1]) / (p2[0]-p1[0]);
    }
    public int solution(int[][] dots) {
        // 각 조합별 기울기 비교
        if (slope(dots[0], dots[1]) == slope(dots[2], dots[3])) return 1; 
        if (slope(dots[0], dots[2]) == slope(dots[1], dots[3])) return 1; 
        if (slope(dots[0], dots[3]) == slope(dots[1], dots[2])) return 1; 
        return 0;
    }
}
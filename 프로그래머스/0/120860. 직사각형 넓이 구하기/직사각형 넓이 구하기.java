import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        // x좌표 기준 오름차순 정렬
        Arrays.sort(dots, (a,b) -> Integer.compare(a[0], b[0]));
        // 정렬된 배열에서 가로는 첫 번째와 마지막 x좌표 차이
        int width = Math.abs(dots[0][0] - dots[3][0]);
        // y좌표도 정렬된 상태에서 상하 위치 비교해서 계산
        // 두 쌍 중 하나만 비교하면 된다.
        // 문제에서 직사각형이므로 직사각형의 네 꼭짓점은 변이 x축 또는 y축에 평행하기 때문에
        int height = Math.abs(dots[0][1] - dots[1][1]);
        return width * height;
    }
}
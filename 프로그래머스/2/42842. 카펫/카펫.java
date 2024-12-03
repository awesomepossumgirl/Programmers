class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow; // 전체 넓이
        
        // 전체 넓이의 약수 탐색
        for (int height = 1; height <= Math.sqrt(area); height++) {
            if (area % height == 0) { // area(넓이)와 height(높이)가 정확히 나누어떨어지는지 확인
                int width = area / height; // 가로는 넓이를 높이로 나눈 값
                
                // 조건을 만족하는지 확인
                if ((width - 2) * (height - 2) == yellow) {
                    return new int[] { width, height }; // 가로 ≥ 세로 조건을 자동으로 만족
                }
            }
        }
        return new int[] {};
    }
}
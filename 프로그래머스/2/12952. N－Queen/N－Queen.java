class Solution {
    int count; // 클래스 레벨 변수로 선언

    public int solution(int n) {
        count = 0;
        int[] queens = new int[n]; // index: 행, value: 열
        placeQueen(0, n, queens);
        return count;
    }

    // row: 현재 배치할 행, n: 체스판 크기, queens: 현재까지 배치된 퀸 정보
    private void placeQueen(int row, int n, int[] queens) {
        if (row == n) {
            count++; // 모든 행에 퀸 배치 완료
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isAvailable(row, col, queens)) {
                queens[row] = col;          // 퀸 배치
                placeQueen(row + 1, n, queens); // 다음 행 재귀 호출
            }
        }
    }

    // 현재 위치에 퀸을 놓을 수 있는지 체크
    private boolean isAvailable(int row, int col, int[] queens) {
        for (int i = 0; i < row; i++) {
            // 같은 열 또는 대각선에 퀸이 있는 경우
            if (queens[i] == col || Math.abs(queens[i] - col) == row - i) {
                return false;
            }
        }
        return true;
    }
}

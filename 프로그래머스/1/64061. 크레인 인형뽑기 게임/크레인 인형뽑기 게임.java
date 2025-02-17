import java.util.Stack;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0; // 터진 인형의 총 개수 (2개씩 사라짐)
        Stack<Integer> stack = new Stack<>(); // 뽑은 인형을 저장할 스택

        // 'moves' 배열의 각 이동에 대해 반복
        for (int move : moves) {
            // 각 열을 순차적으로 확인 (board.length는 행의 개수)
            for (int j = 0; j < board.length; j++) {
                // 현재 위치에 인형이 있다면 (0이 아닌 값)
                if (board[j][move - 1] != 0) {
                    int doll = board[j][move - 1]; // 해당 위치의 인형을 가져옴

                    // 스택이 비어있지 않고, 스택의 맨 위 인형과 현재 인형이 같으면
                    if (!stack.isEmpty() && stack.peek() == doll) { 
                        stack.pop(); // 인형을 터뜨리기 위해 스택에서 제거
                        answer += 2; // 같은 인형이 터져서 2개가 사라짐
                    } else {
                        stack.push(doll); // 스택에 인형을 추가
                    }

                    board[j][move - 1] = 0; // 뽑은 인형은 해당 위치에서 제거 (0으로 설정)
                    break; // 한 번에 하나의 인형만 뽑을 수 있으므로 반복문을 탈출
                }
            }
        }

        return answer; // 터진 인형의 총 개수 반환
    }
}

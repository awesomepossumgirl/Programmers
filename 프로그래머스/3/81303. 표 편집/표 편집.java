import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        // 삭제된 행 인덱스 저장하는 스택
        Stack<Integer> deleted = new Stack<>();
        
        // 각 행 기준으로 연산에 따른 위치 표시하기
        int[] up = new int[n + 2];
        int[] down = new int[n + 2];
        
        for (int i = 0; i < n + 2; i++) {
            up[i] = i - 1;
            down[i] = i + 1;
        }
        
        // 현재 위치를 나타내는 인덱스
        k++;
        
        // 주어진 명령어(cmd)배열을 하나씩 처리
        for (String c : cmd) {
            // 현재 위치 삭제 후 그 다음 위치로 이동하기
            if(c.startsWith("C")) {
                deleted.push(k);
                up[down[k]] = up[k];
                down[up[k]] = down[k];
                // 이건 배열 길이 체크해서 마지막 행이면 커서 위로 올리는 처리
                k = n < down[k] ? up[k] : down[k];
            }
            // 가장 최근에 삭제된 행 복구하기
            else if (c.startsWith("Z")) {
                int restore = deleted.pop();
                down[up[restore]] = restore;
                up[down[restore]] = restore;
            }
            // U or D로 현재 위치 위,아래로 이동하기
            else {
                String[] s = c.split(" ");
                int x = Integer.parseInt(s[1]);
                for (int i = 0; i < x; i++) {
                    k = s[0].equals("U") ? up[k] : down[k];
                }
            }
        }
        
        // 삭제된 행 위치 X표시해서 문자열 반환
        char[] answer = new char[n];
        Arrays.fill(answer, 'O');
        
        for (int i : deleted) {
            answer[i - 1] = 'X';
        }
    
        return new String(answer);
    }
}
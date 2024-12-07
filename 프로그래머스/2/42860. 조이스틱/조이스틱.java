class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        int index = 0;
        int move = length-1; // 좌우 움직임 수 
        
        // 문자 변경 횟수
        for (int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z'-name.charAt(i)+1);
       
        // 연속된 A 개수 확인
        index = i + 1;
        while (index < length && name.charAt(index) == 'A') {
            index++;
        }
        
        // 최소 이동 횟수
        // 순서대로 가는 것과, 뒤로 돌아가는 것 중 이동수가 적은 것을 선택
        // 대신 BBAAAZ같은 경우 오른쪽으로 갔다가 왼쪽으로 가야 해서 이런 수식이 나옴
        move = Math.min(move, i * 2 + length - index);
        
        // BBBBAAAAAAAB 와 같이, 처음부터 뒷부분을 먼저 입력하는 것이 더 빠른 경우 고려
        move = Math.min(move, (length - index) * 2 + i);
        }
        
        // 문자 변경 횟수(answer)와 최소 이동 횟수(move)의 합
        return answer + move ;
    }
}
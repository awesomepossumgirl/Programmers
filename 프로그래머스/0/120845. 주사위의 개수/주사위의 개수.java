/*
class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        // box 배열의 부피 계산
        int volume = box[0] * box[1] * box[2];  
        
        answer = volume / (n*n*n);
        return answer;
    }
}

부피를 채우는 개념이 아니라 들어갈 수 있는 주사위의 갯수이다
공간이 부족하면 주사위는 들어갈 수 없다.
예를 들어 box = [2, 3, 3], n = 3인 경우 들어갈 수 있는 주사위의 최대 갯수는 0개이다.
주사위 한 개를 넣을 수 있는 공간이 부족하기 때문이다. 

*/

class Solution {
    public int solution(int[] box, int n) {
        // 가로, 세로, 높이 각각에 들어갈 주사위의 개수를 계산
        int a = box[0] / n;  // 가로에 들어갈 주사위 개수
        int b = box[1] / n;  // 세로에 들어갈 주사위 개수
        int c = box[2] / n;  // 높이에 들어갈 주사위 개수
        
        // 총 주사위 개수는 a * b * c
        int answer = a * b * c;
        return answer;
    }
}

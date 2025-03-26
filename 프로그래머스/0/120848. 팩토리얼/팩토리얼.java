class Solution {
    public int solution(int n) {
        int i = 1;
        int factorial = 1; 
        
        while (factorial <= n) {
            i++;
            factorial *= i;
            if (factorial > n) {
                return i - 1;
            }
        }
        return i - 1;
    }
}

/* eturn i - 1;을 사용하는 이유
코드를 보면 while 루프 안에서 factorial *= i;를 수행하며 i! 값을 갱신한다.
예를 들어, n = 120일 때 실행 흐름을 보면 i가 6일때 factorial(6!)은 720이다
factorial(5!)가 120을 만족하기 때문에 i-1을 리턴한다. 
*/

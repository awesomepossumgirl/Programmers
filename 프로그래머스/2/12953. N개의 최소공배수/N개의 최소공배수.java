class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    
    // 최대공약수
    public static int gcd(int a, int b) {
        // a % b를 반복해서 나머지가 0이 될 때의 a가 최대공약수
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp; 
        }
        return a;
    }
    
    // 최소공배수
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
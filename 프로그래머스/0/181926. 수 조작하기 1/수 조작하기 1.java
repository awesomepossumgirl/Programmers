class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] arr = control.toCharArray();
        for (char c : arr) {
            switch (c) {
                case ('w'): 
                    answer++;
                    break;
                case ('s'):
                    answer--;
                    break;
                case ('d'):
                    answer += 10;
                    break;
                case ('a'):
                    answer -= 10;
                    break;     
            }
        }
        return answer;
    }
}
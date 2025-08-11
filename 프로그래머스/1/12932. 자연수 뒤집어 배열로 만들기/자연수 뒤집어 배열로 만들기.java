class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            answer[i] = charArray[charArray.length - 1 - i] - '0';
        }
        return answer;
    }
}
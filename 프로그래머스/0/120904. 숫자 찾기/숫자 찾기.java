class Solution {
    public int solution(int num, int k) {
        String numToString = Integer.toString(num);
        char[] arr = numToString.toCharArray();
        char kToChar = (char) (k + '0');
        int idx = -1;
        for(int i = 0; i < arr.length; i++ ) {
            if (arr[i] == kToChar) {
                return i+1;
            }
        }
        return idx;
    }
}
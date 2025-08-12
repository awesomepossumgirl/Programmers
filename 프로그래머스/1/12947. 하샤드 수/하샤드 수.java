class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String str = Integer.toString(x);
        for (char c : str.toCharArray()) {
            sum += c - '0';
        }
        return x % sum == 0;
    }
}
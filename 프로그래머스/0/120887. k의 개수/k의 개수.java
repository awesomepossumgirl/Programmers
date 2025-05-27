class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char target = (char)(k+'0');
        for(int x=i; x <= j; x++) {
            String str = Integer.toString(x);
            for(int idx = 0; idx < str.length(); idx++) {
                if(str.charAt(idx)==target) answer++;
            }
        }
        return answer;
    }
}
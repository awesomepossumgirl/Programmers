class Solution {
    public int solution(int[] common) {
        // 앞 3개의 항으로 등차수열인지 등비수열인지 판별
        int a = common[0];
        int b = common[1];
        int c = common[2];
        int index = common.length -1;
        
        // 등차수열인가?
        if (b - a == c - b) {
            int diff = b - a;
            return common[index] + diff;
        } else { // 등비수열
            int ratio = b / a;
            return common[index] * ratio;
        }
    }
}
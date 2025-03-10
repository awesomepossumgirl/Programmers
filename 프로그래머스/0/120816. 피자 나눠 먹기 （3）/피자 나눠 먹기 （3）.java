class Solution {
    public int solution(int slice, int n) {
        return (n % slice == 0) ? (n / slice) : (n / slice + 1);
    }
}

/*
// Math.ceil로 풀기
class Solution {
    public int solution(int slice, int n) {
        return (int) Math.ceil((double) n / slice);
    }
}
*/
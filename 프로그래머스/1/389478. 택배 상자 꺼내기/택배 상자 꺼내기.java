class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        // 꺼내야 하는 박스 위치
        int pickH = ((num-1)/w) + 1;
        int pickW = (pickH%2 == 1) ? (num-1)%w+1 : pickH*w-num+1;
        
        int now = num;
        int pickCnt = 0;
        
        while(now <= n) {
            pickCnt++;
            
            if((pickH + pickCnt)%2 == 0) now += w*2 - (pickW*2 - 1);
            else now += pickW*2 - 1;
        }
        
        answer = pickCnt;
        
        return answer;
    }
}


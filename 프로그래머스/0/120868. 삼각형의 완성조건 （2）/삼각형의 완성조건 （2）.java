import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides); // 배열 오름차순 정렬
        int shorter = sides[0];
        int longer = sides[1];
        
        // case1: x가 가장 긴 변일 때 -> x < a + b
        int case1 = longer + shorter - 1; 
        
        // case2: x가 짧거나 중간인 경우 -> x > max - min
        int case2 = longer - shorter;
        
        return case1 - case2;
    }
}
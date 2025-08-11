import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        String str = Integer.toString(n);
        for (char c : str.toCharArray()) {
            sum += c - '0';
        }
        
        return sum;
    }
}
import java.util.*;
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        char[] arr = number.toCharArray();
        int len = arr.length - k;
        int index = 0;
        
        for(int i = 0; i < len; i++) {
            char max = '0';
            for(int j = index; j <= i+k; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    index = j+1;
                }
            }
            sb.append(Character.toString(max));
        }
        answer = sb.toString();
        return answer;
    }
}
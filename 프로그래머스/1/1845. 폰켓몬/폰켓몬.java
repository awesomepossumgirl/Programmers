import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        
        HashSet<Integer> nSet = new HashSet<>();
        
        for (int num : nums) {
            nSet.add(num);
        }
        if (nSet.size() > max) {
            return max;
        } else {
            return nSet.size();
        }
    }
}
class Solution {
    public int solution(int[] numbers) {
        boolean[] exist = new boolean[10];
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0 && numbers[i] < 10) {
                exist[numbers[i]] = true;
            }
        }
        
        for (int i = 0; i < exist.length; i++) {
            if(!exist[i]) {
                sum += i;
            }
        }
        
        return sum;
    }
}
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        if (len1 != len2) {
            return (len1 > len2) ? 1 : -1;
        } else {
            int sum1 = 0;
            int sum2 = 0;
            for (int num1 : arr1) {
                sum1 += num1;
            }
            for (int num2 : arr2) {
                sum2 += num2;
            }
            if (sum1 == sum2) {
                return 0;
            }
            return (sum1 > sum2) ? 1 : -1;
        }
    }
}
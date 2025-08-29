class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String answer[] = new String[n];
        for(int i = 0; i < arr1.length; i++) {
            // OR연산
            // int num = Integer.bitCount(arr1[i] | arr2[i]);
            int num = arr1[i] | arr2[i];
            // String binaryStr = Integer.toBinaryString(num);
            // String padded = String.format("%" + n + "s", binaryStr);
            String binary = String.format("%" + n + "s", Integer.toBinaryString(num));
            answer[i] = binary.replace("1", "#").replace("0", " ");        
        }
        
        return answer;
    }
}
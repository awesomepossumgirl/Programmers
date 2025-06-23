class Solution {
    public String solution(int[] numLog) {
        int[] arr = new int[numLog.length - 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numLog.length - 1; i++) {
            arr[i] = numLog[i + 1] - numLog[i];
        }
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 1: 
                    sb.append("w");
                    break;
                case -1:
                    sb.append("s");
                    break;
                case 10:
                    sb.append("d");
                    break;
                case -10:
                    sb.append("a");
                    break;
                    
            }
        }
        return sb.toString();
    }
}
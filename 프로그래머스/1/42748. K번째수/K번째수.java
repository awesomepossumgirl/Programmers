import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
        int[] slicedArray = Arrays.copyOfRange(array, 
                                               commands[i][0]-1, commands[i][1]);
            Arrays.sort(slicedArray);
            result[i] = slicedArray[commands[i][2]-1];
        }
        return result;
    }
}
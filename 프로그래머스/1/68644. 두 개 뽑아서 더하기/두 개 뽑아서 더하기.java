import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> answer = new HashSet<>(); // 중복 제거용 해시셋
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            } 
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
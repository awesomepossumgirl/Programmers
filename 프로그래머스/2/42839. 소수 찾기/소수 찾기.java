import java.util.HashSet;
import java.util.Iterator;

class Solution {
    private HashSet<Integer> numSet = new HashSet<>();  // 숫자 순열을 저장할 Set

    // 소수 판별 메서드
    public static boolean isPrime(int num) {
        if (num < 2) return false; // 2 미만은 소수가 아님
        for (int i = 2; i <= Math.sqrt(num); i++) { // 2부터 √num까지 확인
            if (num % i == 0) return false; // 나누어떨어지면 소수가 아님
        }
        return true; // 나누어떨어지지 않으면 소수
    }

    // 순열을 생성하는 재귀 메서드
    public void generatePermutations(StringBuilder prefix, StringBuilder str) {
        // prefix가 비어있지 않으면 numSet에 숫자로 변환하여 추가
        if (prefix.length() > 0) {
            numSet.add(Integer.parseInt(prefix.toString()));
        }

        // str에 남아 있는 문자를 하나씩 선택하여 순열을 생성
        for (int i = 0; i < str.length(); i++) {
            // 현재 문자를 prefix에 추가하고 str에서 제거
            char removed = str.charAt(i);
            prefix.append(removed);
            str.deleteCharAt(i);

            // 재귀 호출로 나머지 문자들로 순열을 생성
            generatePermutations(prefix, str);

            // 백트래킹: 선택한 문자를 다시 원래 상태로 복구
            prefix.deleteCharAt(prefix.length() - 1);
            str.insert(i, removed);
        }
    }

    // solution 메서드
    public int solution(String numbers) {
        numSet.clear(); // numSet 초기화 (이전에 저장된 값 삭제)
        generatePermutations(new StringBuilder(), new StringBuilder(numbers)); // 순열 생성

        int count = 0;
        // numSet에 저장된 숫자들을 순회하면서 소수인 숫자만 카운트
        Iterator<Integer> it = numSet.iterator();
        while (it.hasNext()) {
            int number = it.next();
            if (isPrime(number)) count++; // 소수이면 count 증가
        }
        return count;  // 소수의 개수를 반환
    }
}
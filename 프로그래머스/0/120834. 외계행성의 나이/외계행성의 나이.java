class Solution {
    public String solution(int age) {
        StringBuilder result = new StringBuilder();
        String ageStr = String.valueOf(age);
        for (char digit : ageStr.toCharArray()) {
            result.append((char) ('a' + (digit - '0')));
        }
        return result.toString();
    }
}
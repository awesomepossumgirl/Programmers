class Solution {
    public int solution(String my_string) {
        String[] splited = my_string.split(" ");
        int answer = Integer.parseInt(splited[0]);
        
        for(int i = 1; i < splited.length; i += 2) {
            String op = splited[i];
            int num = Integer.parseInt(splited[i + 1]);
            
            if (op.equals("+")) {
                answer += num;
            } else if (op.equals("-")) {
                answer -= num;
            }
        }
        return answer;
    }
}
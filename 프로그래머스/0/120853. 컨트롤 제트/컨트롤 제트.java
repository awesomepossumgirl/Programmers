class Solution {
    public int solution(String s) {
        String[] str = s.split(" ");
        int sum = 0;
        int lastNumber = 0;
        
        for (String st : str) {
            if(st.equals("Z")) {
                sum -= lastNumber;
            } else {
                lastNumber = Integer.parseInt(st);
                sum += lastNumber;
            }
        }
        return sum;
    }
}
class Solution {
    public String solution(String[] seoul) {
        int idx = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                idx = i;
                break; // 김서방 찾으면 뒤에는 더 볼 필요 없음
            }
        }
        
        // 포매팅
        return String.format("김서방은 %d에 있다", idx);        
    }
}
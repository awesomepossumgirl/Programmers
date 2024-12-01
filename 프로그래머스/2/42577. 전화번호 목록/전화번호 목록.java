import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. 해시맵 선언
        HashMap<String, Integer> map = new HashMap<>();
        
        // 2.모든 전화번호를 해시맵에 추가
        for (String phone : phone_book) {
            map.put(phone, 1);
        }
        
        // 3. 각 번호가 다른 번호의 접두사인지 확인
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if(map.containsKey(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
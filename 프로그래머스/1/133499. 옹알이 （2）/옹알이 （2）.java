class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int count = 0;
        
        for (String b : babbling) {
            String prev = ""; // 이전 발음을 저장해서 연속 확인
            boolean valid = true; // 처음에는 유효하다고 가정하고 시작
            int i = 0;
            
            while (i < b.length()) {
                boolean matched = false;
                
                for (String w : words) {
                    if (b.startsWith(w, i) && !w.equals(prev)) {
                        prev = w;
                        i += w.length();
                        matched = true;
                        break;
                    }
                }
                
                // 네 가지 발음 중 하나도 매칭 안 되면 유효하지 않음
                if (!matched) {
                    valid = false;
                    break;
                }
            }
            // 끝까지 조건을 만족했다면 count++
            if (valid) count++;
        }
        
        return count;
    }
}
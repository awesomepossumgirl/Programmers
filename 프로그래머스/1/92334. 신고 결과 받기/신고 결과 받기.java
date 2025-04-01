import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 신고 당한 사람(key) - 신고한 사람(value)
        HashMap<String, HashSet<String>> reportedUser = new HashMap<>();
        // 신고한사람 - 메일 받을 횟수
        HashMap<String, Integer> cnt = new HashMap<>();
        
        for (String id : id_list) {
            cnt.put(id, 0);
        }
        
        // 신고 기록 저장
        for (String r : report) {
            String[] name = r.split(" ");
            String reportUser = name[0];
            String reported = name[1];
            
            if (!reportedUser.containsKey(reported)) {
                reportedUser.put(reported, new HashSet<>());
            }
            reportedUser.get(reported).add(reportUser);  
        }
        for(Map.Entry<String, HashSet<String>> entry : reportedUser.entrySet()) {
            if (entry.getValue().size() >= k) { // 정지 기준
                for (String user : entry.getValue()) {
                    cnt.put(user, cnt.getOrDefault(user, 0) +1);
                }
            } 
        }
        int[] answer = new int[id_list.length];
        
        for (int i = 0 ; i < id_list.length; i++) {
            answer[i] = cnt.getOrDefault(id_list[i], 0);
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playersList = new HashMap<>();
        
        // 1. players 배열의 선수 이름과 인덱스를 playersList에 저장
        for (int i = 0; i < players.length; i++) {
            playersList.put(players[i], i);
        }
        for (int i = 0; i < callings.length; i++) {
            // 2. 호출된 선수 인덱스
            int currentIdx = playersList.get(callings[i]);
            // 3. 바로 앞 선수 인덱스
            int frontIdx = currentIdx - 1;
            // 4. 앞 선수 이름
            String frontPlayer = players[frontIdx];
            // 5. 두 선수 위치바꾸기
            players[frontIdx] = callings[i];
            players[currentIdx] = frontPlayer;
            // 6. 인덱스 정보도 업데이트 - put(key, newValue)
            playersList.put(callings[i], frontIdx);
            playersList.put(frontPlayer, currentIdx);
        }
        
    return players;
    }
}
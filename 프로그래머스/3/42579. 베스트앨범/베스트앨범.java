import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        // 1. 베스트앨범에 들어갈 노래 담을 ArrayList 생성
        ArrayList<Integer> album = new ArrayList<>();

        // 2. 장르별 총 재생횟수 저장할 HashMap num 선언
        HashMap<String, Integer> num = new HashMap<>();

        // 3. 장르별로 각 노래(고유 인덱스 번호)의 재생횟수 저장할 HashMap music 선언
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            // genres 배열을 순회하며 각 노래에 대한 정보를 수집
            if(!num.containsKey(genres[i])) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]); // 새로운 노래 인덱스와 재생 횟수 추가
                music.put(genres[i], map); // 새로운 장르와 노래 정보를 추가
                num.put(genres[i], plays[i]); // 해당 장르의 총 재생 횟수를 초기화
            } else {
                music.get(genres[i]).put(i, plays[i]); // 기존 장르에 노래 인덱스와 재생 횟수 추가
                num.put(genres[i], num.get(genres[i]) + plays[i]); // 장르별 총 재생 횟수 누적
            }
        }

        // 4. 정렬을 위해서 num의 KeySet(장르명)을 리스트로 변환
        List<String> keySet = new ArrayList<>(num.keySet());
        Collections.sort(keySet, (s1, s2) -> num.get(s2) - num.get(s1)); // 장르별 총 재생 횟수에 따라 내림차순 정렬

        for (String key : keySet) {
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> genreKey = new ArrayList<>(map.keySet());

            // 재생 횟수에 따라 노래 인덱스 정렬
            Collections.sort(genreKey, (s1, s2) -> map.get(s2) - map.get(s1));

            album.add(genreKey.get(0)); // 첫 번째 곡 추가
            if(genreKey.size() > 1) {
                album.add(genreKey.get(1)); // 두 번째 곡 추가 (있을 경우)
            }
        }

        // ArrayList를 int[]로 변환하여 반환
        return album.stream().mapToInt(i -> i).toArray();
    }
}

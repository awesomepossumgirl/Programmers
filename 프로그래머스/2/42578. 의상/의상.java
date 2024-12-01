import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        // 1. 의상 종류, 카운트 담을 HashMap 선언
        HashMap<String, Integer> map = new HashMap<>();
        
        // 2. 결과값 담을 변수 선언
        int result = 1;
        
        // 3. clothes 를 순환하면서 의상 종류 가져와서 해시테이블에 넣기
        for (String[] clothe : clothes){
            String type = clothe[1];
            map.put(type, map.getOrDefault(type,0)+1);
        }
        
        // 4. 해시맵의 value값(count)들만 순회하기
        Iterator<Integer> iter = map.values().iterator();
        
        // 5. 
        while (iter.hasNext()){
            result *= (iter.next().intValue()+1);
        }
        return result-1;
    }
}
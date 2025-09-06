import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5; // 캐시 없으먄 모두 miss
        
        int time = 0;
        
        // accessOrder = true 
        // 이렇게 하면 최근에 접근한 순서대로 자동 정렬
        LinkedHashMap<String, String> cache = new LinkedHashMap<>(cacheSize, 0.75f, true) {
        	protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
        		return size() > cacheSize; // 캐시 크기 초과하면 자동으로 가장 오래된 것 삭제
        	}
        };
        
        for (String city : cities) {
        	city = city.toLowerCase();
        	
        	if (cache.containsKey(city)) {
        		time += 1; // hit
        	} else {
        		time += 5; // miss
        	}
        	
        	cache.put(city, city); // 접근시 자동으로 최근 순서 갱신
        }
        
        return time;  
    }
}
class Solution {
    public int solution(int chicken) {
        int service = 0;
        
        // 쿠폰 10장 이상일 때만 서비스 치킨 가능
        while (chicken >= 10) {
            int newService = chicken / 10; // 서비스 치킨 수
            service += newService;
            chicken = newService + (chicken % 10); // 새쿠폰 + 남은 쿠폰
        }
        return service;
    }
}
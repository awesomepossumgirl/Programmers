class Solution {
    public int solution(String[] order) {
        int total = 0;
        
        for (String menu : order) {
            if (menu.equals("cafelatte") || menu.contains("cafelatte")) {
                total += 5000;
            } else {
                // americano 또는 anything
                total += 4500;
            }
        }
        
        return total;
    }
}
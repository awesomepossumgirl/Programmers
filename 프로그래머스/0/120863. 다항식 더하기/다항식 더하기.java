class Solution {
    public String solution(String polynomial) {
        String[] splited= polynomial.split(" \\+ ");
        int xSum = 0;
        int constantSum = 0;
        StringBuilder sb  = new StringBuilder();
        
        for(String s : splited) {
            if(s.contains("x")) {
               String xNum = s.replace("x", "");
               if(xNum.equals("")) xNum = "1";
               xSum += Integer.parseInt(xNum);
            } else {
                constantSum += Integer.parseInt(s);
            }
        }
        // 둘다 0인 경우
        if (xSum==0&&constantSum==0) return "0";
        // x항 없는 경우
        if (xSum==0) return String.valueOf(constantSum);
        // 상수항이 없는 경우
        if (constantSum==0) return xSum==1? "x":xSum+"x";
        // 둘다 있는 경우
        return (xSum==1? "x":xSum+"x") + " + " + constantSum;
    }
}
class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int n = schedules.length;
        int count = 0;

        // 직원별 체크
        for (int i = 0; i < n; i++) {
            int targetTime = moreTime(schedules[i]);
            boolean allOnTime = true;
            
            for (int j = 0; j < timelogs[i].length; j++) {
                if ((startday + j) % 7 > 0 && (startday + j) % 7 < 6) {
                    if (timelogs[i][j] > targetTime) {
                        allOnTime = false;
                        break;
                    }
                }
            }
            
            if (allOnTime) count++;
        }
        return count;
    }

    public int moreTime(int time) {
        time += 10;
        if (time % 100 >= 60) {
            time += 40;
        }
        return time;
    }
}

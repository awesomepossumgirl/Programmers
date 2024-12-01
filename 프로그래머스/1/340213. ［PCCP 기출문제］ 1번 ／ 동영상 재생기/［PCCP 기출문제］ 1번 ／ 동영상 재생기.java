import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Solution {
    
    private LocalTime videoTime;
    private LocalTime posTime;
    private LocalTime opStartTime;
    private LocalTime opEndTime;    
        
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
         
        // 시간 문자열 분리
        String videoSplit[] = video_len.split(":");
        String posSplit[] = pos.split(":");
        String opStart[] = op_start.split(":");
        String opEnd[] = op_end.split(":");
        
        // LocalTime으로 변환
        videoTime = getTime(videoSplit); // 전체 동영상 시간
        posTime = getTime(posSplit); // 현재 재생 위치
        opStartTime = getTime(opStart); // 오프닝 시작 위치
        opEndTime = getTime(opEnd); // 오프닝 끝 위치
        
        // 처음 재생 시 오프닝 스킵
        skipOp(); 
        
        // 명령어 처리
        for (String command : commands) {
            if (command.equals("prev")) {
                moveToPrev();
            } else if (command.equals("next")) {
                moveToNext(); 
            }
            skipOp();
        }
        // 현재 재생 시간을 "mm:ss" 형식으로 반환(패딩처리)
        return posTime.format(DateTimeFormatter.ofPattern("mm:ss"));
    }
    
    // 10초 뒤로 이동하는 메서드
    private void moveToNext() {
        posTime = posTime.plusSeconds(10);
        if (posTime.isAfter(videoTime)) {
            posTime = videoTime; // 동영상 끝 시간을 초과하지 않도록 설정
        }
    }
    
    // 10초 앞으로 이동하는 메서드
    private void moveToPrev() {
        int minute = posTime.getMinute();
        int second = posTime.getSecond();
        
        if (minute == 0 && second < 10) {
            posTime = LocalTime.of(0, 0, 0); // 0초 미만으로 이동하면 00:00으로 설정
            return;
        }
        posTime = posTime.minusSeconds(10);
    } 
    
    // 오프닝 스킵 메서드
    private void skipOp() {
        if (!posTime.isBefore(opStartTime) && !posTime.isAfter(opEndTime)) {
            posTime = opEndTime; // 오프닝 시간 내에 있으면 오프닝 끝으로 이동
        }
    }
    
    // 문자열로 표현된 시간을 LocalTime 타입으로 변환하는 메서드
    private LocalTime getTime(String[] split) {
        int min = Integer.parseInt(split[0]);
        int sec = Integer.parseInt(split[1]);
        return LocalTime.of(0, min, sec);
    }

}

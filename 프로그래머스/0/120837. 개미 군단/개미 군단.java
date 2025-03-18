class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = hp/5;
        int soldier = (hp%5)/3;
        int ant = ((hp%5)%3);
        answer = general + soldier + ant;
        return answer;
    }
}
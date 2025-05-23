public class Solution {
  public int solution(int m, int n, int[][] puddles) {
    int[][] street = new int[n][m];

    // 웅덩이는 -1로 초기화
    for (int[] puddle : puddles)
      street[puddle[1] - 1][puddle[0] - 1] = -1;

    // 시작점 1로 초기화
    street[0][0] = 1;

    for (int i = 0; i < n; i++) { 
      for (int j = 0; j < m; j++) {

        if(street[i][j] == -1) { // 웅덩이면 0으로 바꾸고 계산 
          street[i][j] = 0;
          continue;
        }

        if(i != 0)
          street[i][j] += street[i - 1][j] % 1000000007; 
        if(j != 0)
          street[i][j] += street[i][j - 1] % 1000000007; 
      }
    }

    return street[n - 1][m - 1] % 1000000007;
  }
}
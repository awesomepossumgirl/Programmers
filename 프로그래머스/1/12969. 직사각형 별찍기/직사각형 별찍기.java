import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 가로
        int m = sc.nextInt(); // 세로
        
        for (int i = 0 ; i < m; i++) {
        StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }

        sc.close();
    }
}

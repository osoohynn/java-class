package programmers;

import java.util.Arrays;

public class ProEx9 {
    public int[][] solution(int n) {
        int[][] answer = new int[n+1][n+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j) answer[i][j] = 1;
                else answer[i][j] = 0;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        ProEx9 p = new ProEx9();
        System.out.println(Arrays.deepToString(p.solution(5)));
    }
}

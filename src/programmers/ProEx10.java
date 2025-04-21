package programmers;

import java.util.Arrays;

public class ProEx10 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] directX = {0, 1, 0, -1};
        int[] directY = {1, 0, -1, 0};
        int x = 0; int y = 0; int dir = 0;

        for (int i = 1; i <= n * n; i++) {
            answer[x][y] = i;

            int nx = x + directX[dir]; int ny = y + directY[dir];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n || answer[nx][ny] != 0) {
                dir = (dir + 1) % 4;
                nx = x + directX[dir]; ny = y + directY[dir];
            }

            x = nx; y = ny;
        }

        return answer;
    }

    public static void main(String[] args) {
        ProEx10 pro = new ProEx10();
        int[][] answer = pro.solution(4);
        System.out.println(Arrays.deepToString(answer));
    }
}

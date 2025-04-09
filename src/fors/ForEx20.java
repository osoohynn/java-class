package fors;

import java.util.Arrays;

class ForEx20 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int min_max = 1000000;
            boolean chk = false;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && arr[j] < min_max) {
                    min_max = arr[j];
                    chk = true;
                }
            }
            if (!chk) answer[i] = -1;
            else answer[i] = min_max;
        }

        return answer;
    }

    public static void main(String[] args) {
        ForEx20 forEx20 = new ForEx20();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        System.out.println(Arrays.toString(forEx20.solution(arr, queries)));
    }
}
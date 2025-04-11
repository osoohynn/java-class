package fors;

import java.util.Arrays;

class ForEx20 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0) {
                    arr[j] += 1;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        ForEx20 forEx20 = new ForEx20();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
//        int[][] queries = {{0, 4, 1},{0, 3, 2}};
        System.out.println(Arrays.toString(forEx20.solution(arr, queries)));
    }
}
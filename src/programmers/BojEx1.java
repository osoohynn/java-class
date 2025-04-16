package programmers;

import java.util.Scanner;

public class BojEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][5];
        int[] candidate = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        candidate[i]++; break;
                    }
                }
            }
        }

        int max = 0;
        for (int i = 1; i < n; i++) {
            if (candidate[i] > candidate[max]) {
                max = i;
            }
        }

        System.out.println(max + 1);
    }
}

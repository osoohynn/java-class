package tdarray;

import java.util.Scanner;

public class TArrEx2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
            }
        }

        while (true) {
            System.out.println("현재 좌석표:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("예매할 좌석 입력(행, 열): ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == -1) break;

            if (arr[x][y] == 1) {
                System.out.println("예매가 불가능합니다. 다시 입력해주세요.");
            } else {
                arr[x][y] = 1;
                System.out.println("예약이 되었습니다.");
            }
        }
    }
}

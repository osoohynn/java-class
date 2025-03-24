package array;

import java.util.Scanner;

public class ArrEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수: ");
        int m = sc.nextInt();

        int[] arr = new int[m];

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            arr[i] = n;
            total += n;
        }

        System.out.println("합계: " + total);
        System.out.println("평균: " + (double) total / arr.length);
    }
}

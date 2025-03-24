package array;

import java.util.Scanner;

public class ArrEx4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println(arr[0]);
    }
}

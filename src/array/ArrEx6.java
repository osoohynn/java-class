package array;

import java.util.Scanner;

public class ArrEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수: ");
        int m = sc.nextInt();

        int[] arr = new int[m];
        
        int minN = 100; int maxN = 0;

        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            arr[i] = n;
            
            if (n < minN) minN = n;
            if (n > maxN) maxN = n;
        }

        System.out.println(minN);
        System.out.println(maxN);

        for (int a : arr) {
            System.out.println(a);
        }
    }
}

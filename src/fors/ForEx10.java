package fors;

import java.util.Scanner;

public class ForEx10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("===for===");
        int forSum = 0;
        for (int i = 1; i <= n; i++) {
            forSum += i;
            System.out.print(forSum + " ");
        }

        System.out.println("\n===while===");
        int j = 1; int whileSum = 0;
        while (j <= n) {
            whileSum += j;
            System.out.print(whileSum + " ");
            j++;
        }
    }
}

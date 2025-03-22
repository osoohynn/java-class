package fors;

import java.util.Scanner;

public class ForEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) n++;

        System.out.println("===for===");
        for (int i = 0; i < 5; i += 1) System.out.print(n + i * 2 + " ");

        System.out.println("\n\n===while===");
        int j = 0; while (j < 5) System.out.print(n + j++ * 2 + " ");
    }
}

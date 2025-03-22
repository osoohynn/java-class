package quizes;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            if (a <= b) {
                for (int j = a; j <= b; j++) {
                    System.out.print(j + " * " + i + " = " + j * i + "   ");
                }
            } else {
                for (int j = a; j >= b; j--) {
                    System.out.print(j + " * " + i + " = " + j * i + "   ");
                }
            }
            System.out.println();
        }
    }
}

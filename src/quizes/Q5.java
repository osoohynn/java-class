package quizes;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int total = n1 + n2;

        System.out.println("sum : " + total);
        System.out.println("avg : " + (double) total/2);
    }
}

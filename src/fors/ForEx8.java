package fors;

import java.util.Scanner;

public class ForEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("===for===");
        for (int i = num; i < num + 5; ++i) {
            System.out.println(i);
        }

        System.out.println("===while===");
        int count = 0;
        while (count < 5) {
            System.out.println(num+count);
            count++;
        }
    }
}

package operation;

import java.util.Scanner;

public class OperationEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        int coupon;
        if (grade == 1) coupon = 1000;
        else if (grade == 2) coupon = 2000;
        else if (grade == 3) coupon = 3000;
        else coupon = 500;

        System.out.println(coupon);
    }
}

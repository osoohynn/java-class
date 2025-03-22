package operation;

import java.util.Scanner;

public class OperationEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        int coupon;

        switch (grade) {
            case 1: coupon = 1000; break;
            case 2: coupon = 2000; break;
            case 3: coupon = 3000; break;
            default: coupon = 500; break;
        }

        System.out.println(coupon);
    }
}

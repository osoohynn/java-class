package operation;

import java.util.Scanner;

public class OperationEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();

        int day = switch (mon) {
            case 3 -> 38;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        System.out.println(day);
    }
}
